package com.practicados.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practicados.beans.Jugador;
import com.practicados.interfaces.IEquipo;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext= new ClassPathXmlApplicationContext("Com/practicados/xml/beans.xml");
		//Jugador jug=(Jugador) appContext.getBean("messi");
		//System.out.println(jug.getNombre() +" - " +jug.getEquipo().mostrar());
		
		//IEquipo iEquip=(IEquipo)appContext.getBean("barcelona");
		//System.out.println(iEquip.mostrar());
		
		Jugador jug=(Jugador)appContext.getBean("messi");
		System.out.println(jug.getNombre()+" "+jug.getEquipo().mostrar());
		
		((ConfigurableApplicationContext) appContext).close();

	}

}

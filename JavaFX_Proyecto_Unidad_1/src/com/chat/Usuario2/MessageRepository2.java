package com.chat.Usuario2;

import java.util.ArrayList;
import java.util.List;

public class MessageRepository2 {
	
	public List<Message2> messages = new ArrayList<>();

	public MessageRepository2() {

		// Mensajes entre Fernanda y YO User1
		messages.add(new Message2(1, "Me", "Fernanda", "23-06-2022 12:02:00", 
				"Hola, como estas?, te conoci el otro dia."));
		messages.add(new Message2(2, "Me", "Fernanda", "23-06-2022 12:02:00", "te acuerdas de mi?"));
		messages.add(new Message2(3, "Fernanda", "Me", "23-06-2022 12:00:00", "Hola, sí, me acuerdo de ti "));
		messages.add(new Message2(4, "Me", "Fernanda", "23-06-2022 12:01:00", "Como estas?"));
		messages.add(new Message2(5, "Fernanda", "Me", "23-06-2022 12:02:00",
				"Estoy bien y como estas tu?"));
		messages.add(new Message2(6, "Me", "Fernanda", "23-06-2022 12:01:00", 
				"Bien muy bien, Te gustaria salir a tomar algo conmigo?"));
		messages.add(new Message2(7, "Fernanda", "Me", "23-06-2022 12:00:00", "Sí,con gusto "));
		
		// Mensajes entre Jose y YO User2
		messages.add(new Message2(8, "Jose", "Me", "23-06-2022 12:03:00", "Hola bro como estas?...."));
		messages.add(new Message2(9, "Me", "Jose", "23-06-2022 12:03:00", "estoy bien y tu?, Como va la familia?"));
		messages.add(new Message2(10, "Jose", "Me", "23-06-2022 12:03:00", "Bien , todos bien.."));
		messages.add(new Message2(11, "Jose", "Me", "23-06-2022 12:03:00", "Hola bro como estas?...."));
		messages.add(new Message2(12, "Me", "Jose", "23-06-2022 12:03:00", "estoy bien y tu?, Como va la familia?"));
		messages.add(new Message2(13, "Jose", "Me", "23-06-2022 12:03:00", "Bien , Gracias eres buena persona.."));


		// Mensajes entre Pepito y YO User3
		messages.add(new Message2(14, "Pepito", "Me", "23-06-2022 12:00:00", "Hola Como estas?"));
		messages.add(new Message2(15, "Me", "Pepito", "23-06-2022 12:01:00", "Bien. estoy bien, como estas tu??"));
		messages.add(new Message2(16, "Pepito", "Me", "23-06-2022 12:02:00",
				"Por saludandote. Como vas con los estudios?"));
		messages.add(new Message2(17, "Me", "Pepito", "23-06-2022 12:02:00", "Voy bien, estoy a punto de graduarme"));
	}

	public List<Message2> getMessages(String from, String to) {
		List<Message2> result = new ArrayList<>();
		for (Message2 msg : messages) {
			if (msg.getFrom().equals(from) && msg.getTo().equals(to)
					|| (msg.getFrom().equals(to) && (msg.getTo().equals(from)))) {
				result.add(msg);
			}

		}
		return result;
	}

}

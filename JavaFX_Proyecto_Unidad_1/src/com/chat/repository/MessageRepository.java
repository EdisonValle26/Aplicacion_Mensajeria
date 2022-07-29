package com.chat.repository;

import java.util.ArrayList;
import java.util.List;

import com.chat.domain.Message;

public class MessageRepository {

	public List<Message> messages = new ArrayList<>();

	public MessageRepository() {

		// Mensajes entre Anahís y YO User1
		messages.add(new Message(1, "Me", "Anahís", "23-06-2022 12:02:00", 
				"Hola, como estas?, te conoci el otro dia."));
		messages.add(new Message(2, "Me", "Anahís", "23-06-2022 12:02:00", "te acuerdas de mi?"));
		messages.add(new Message(3, "Anahís", "Me", "23-06-2022 12:00:00", "Hola, sí, me acuerdo de ti "));
		messages.add(new Message(4, "Me", "Anahís", "23-06-2022 12:01:00", "Como estas?"));
		messages.add(new Message(5, "Anahís", "Me", "23-06-2022 12:02:00",
				"Estoy bien y como estas tu?"));
		messages.add(new Message(6, "Me", "Anahís", "23-06-2022 12:01:00", 
				"Bien muy bien, Te gustaria salir a tomar algo conmigo?"));
		messages.add(new Message(7, "Anahís", "Me", "23-06-2022 12:00:00", "Sí,con gusto "));
		
		// Mensajes entre Juan y YO User3
		messages.add(new Message(8, "Juan", "Me", "23-06-2022 12:03:00", "Hola bro como estas?...."));
		messages.add(new Message(9, "Me", "Juan", "23-06-2022 12:03:00", "estoy bien y tu?, Como va la familia?"));
		messages.add(new Message(10, "Juan", "Me", "23-06-2022 12:03:00", "Bien , todos bien.."));
		messages.add(new Message(11, "Juan", "Me", "23-06-2022 12:03:00", "Hola bro como estas?...."));
		messages.add(new Message(12, "Me", "Juan", "23-06-2022 12:03:00", "estoy bien y tu?, Como va la familia?"));
		messages.add(new Message(13, "Juan", "Me", "23-06-2022 12:03:00", "Bien , Gracias eres buena persona.."));

		// Mensajes entre Cesar y YO User2
		messages.add(new Message(14, "Cesar", "Me", "23-06-2022 12:00:00", "Hola . Como estas?"));
		messages.add(new Message(15, "Me", "Cesar", "23-06-2022 12:01:00", "Bien. Que te cuentas?"));
		messages.add(new Message(16, "Cesar", "Me", "23-06-2022 12:02:00",
				"Por saludandote. Por si acaso, tienes $10 que me prestes"));
		messages.add(new Message(17, "Me", "Cesar", "23-06-2022 12:02:00", "Claro, con gusto"));
		messages.add(new Message(18, "Cesar", "Me", "23-06-2022 12:02:00",
				"Por saludandote. Por si acaso, tienes $10 que me prestes"));
		messages.add(new Message(19, "Me", "Cesar", "23-06-2022 12:02:00", "Claro, con gusto"));
		messages.add(new Message(20, "Cesar", "Me", "23-06-2022 12:00:00", "Hola . Como estas?"));
		messages.add(new Message(21, "Me", "Cesar", "23-06-2022 12:01:00", "Bien. Que te cuentas?"));
		messages.add(new Message(22, "Cesar", "Me", "23-06-2022 12:02:00",
				"Por saludandote. Por si acaso, tienes $10 que me prestes"));
		messages.add(new Message(23, "Me", "Cesar", "23-06-2022 12:02:00", "Claro, con gusto"));
		messages.add(new Message(24, "Cesar", "Me", "23-06-2022 12:02:00",
				"Por saludandote. Por si acaso, tienes $10 que me prestes"));
		messages.add(new Message(25, "Me", "Cesar", "23-06-2022 12:02:00", "Claro, con gusto"));

		// Mensajes entre Carlos y YO User4
		messages.add(new Message(26, "Carlos", "Me", "23-06-2022 12:03:00", "Hola bro como estas?...."));
		messages.add(new Message(27, "Me", "Carlos", "23-06-2022 12:03:00", "estoy bien y tu?, Como va la familia?"));
		messages.add(new Message(28, "Carlos", "Me", "23-06-2022 12:03:00", "Bien , todos bien.."));
		messages.add(new Message(29, "Carlos", "Me", "23-06-2022 12:03:00", "Hola bro como estas?...."));
		messages.add(new Message(30, "Me", "Carlos", "23-06-2022 12:03:00", "estoy bien y tu?, Como va la familia?"));
		messages.add(new Message(31, "Carlos", "Me", "23-06-2022 12:03:00", "Bien , todos bien.."));

		// Mensajes entre Papá y YO User5
		messages.add(new Message(32, "Papá", "Me", "23-06-2022 12:00:00", "Hola Hijo. Como estas?"));
		messages.add(new Message(33, "Me", "Papá", "23-06-2022 12:01:00", "Bien. estoy bien, como estas tu??"));
		messages.add(new Message(34, "Papá", "Me", "23-06-2022 12:02:00",
				"Por saludandote. Como vas con los estudios?"));
		messages.add(new Message(35, "Me", "Papá", "23-06-2022 12:02:00", "Voy bien, estoy a punto de graduarme"));

		// Mensajes entre Mamá y YO User6
		messages.add(new Message(36, "Mamá", "Me", "23-06-2022 12:00:00", "Hola Hijo. Como estas?"));
		messages.add(new Message(37, "Me", "Mamá", "23-06-2022 12:01:00", "Bien. estoy bien, como estas tu??"));
		messages.add(new Message(38, "Mamá", "Me", "23-06-2022 12:02:00",
				"Por saludandote. Como vas con los estudios?"));
		messages.add(new Message(39, "Me", "Mamá", "23-06-2022 12:02:00", "Voy bien, estoy a punto de graduarme"));
	}

	public List<Message> getMessages(String from, String to) {
		List<Message> result = new ArrayList<>();
		for (Message msg : messages) {
			if (msg.getFrom().equals(from) && msg.getTo().equals(to)
					|| (msg.getFrom().equals(to) && (msg.getTo().equals(from)))) {
				result.add(msg);
			}

		}
		return result;
	}
}

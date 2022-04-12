package com.Jvnyor.testbot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Jvnyor.testbot.repository.InfoRepository;

@SpringBootApplication
public class TestbotApplication {

	@Autowired
	private InfoRepository infoRepository;
	
//	@Component
//	class BotConnection implements ApplicationRunner {
//
//		@Override
//		public void run(ApplicationArguments args) throws Exception {
//
//			final String token = "";
//			final DiscordClient client = DiscordClient.create(token);
//
//			client.login().flatMapMany(gateway -> gateway.on(MessageCreateEvent.class))
//					.map(MessageCreateEvent::getMessage)
//					.flatMap(infoRepository.save(Info.builder().info(MessageCreateEvent.).build()))
//					.flatMap(Message::getChannel)
//					.flatMap(channel -> channel.createMessage("Salvo"))
//					.blockLast();
//		}
//	}

	public static void main(String[] args) {
		SpringApplication.run(TestbotApplication.class, args);
	}

}

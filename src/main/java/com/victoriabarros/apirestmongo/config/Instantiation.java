package com.victoriabarros.apirestmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.victoriabarros.apirestmongo.domain.Post;
import com.victoriabarros.apirestmongo.domain.User;
import com.victoriabarros.apirestmongo.dto.AuthorDTO;
import com.victoriabarros.apirestmongo.dto.CommentDTO;
import com.victoriabarros.apirestmongo.repository.PostRepository;
import com.victoriabarros.apirestmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	
	@Override
	public void run(String... args) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GTM"));
		
		userRepository.deleteAll();
		postRepository.deleteAll();
		
		User maria = new User(null, "Maria Souza", "maria@gmail.com");
		User alex = new User(null, "Alex Silva", "alex@gmail.com");
		User joão = new User(null, "João Santos", "joao@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, joão));
		
		Post post1 = new Post(null, sdf.parse("30/10/2022"), "bora votar", "já votei, agora é só aguardar", new AuthorDTO(maria));
		Post post2 = new Post(null, sdf.parse("24/11/2022"), "copa do mundo!", "vai Brasil!", new AuthorDTO(maria));
		
		CommentDTO c1 = new CommentDTO("ansioso com o resultado dessas eleições", sdf.parse("30/10/2022"), new AuthorDTO(alex));
		CommentDTO c2 = new CommentDTO("apuração muito acirrada", sdf.parse("30/10/2022"), new AuthorDTO(joão));
		CommentDTO c3 = new CommentDTO("melhor seleção!", sdf.parse("24/10/2022"), new AuthorDTO(alex));
		
		post1.getComments().addAll(Arrays.asList(c1, c2));
		post2.getComments().addAll(Arrays.asList(c3));
		
		postRepository.saveAll(Arrays.asList(post1, post2));
		
		maria.getPosts().addAll(Arrays.asList(post1, post2));
		userRepository.save(maria);
	}

}

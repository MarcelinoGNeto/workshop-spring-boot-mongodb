package com.netomarcelino.workshopmongo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netomarcelino.workshopmongo.domain.Post;
import com.netomarcelino.workshopmongo.services.PostService;

@RestController
@RequestMapping(value = "/users")
public class PostResource {

	@Autowired
	private PostService service;

	//Método para pesquisar dados no banco
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Post> findById(@PathVariable String id) {
		Post obj = service.findById(id);
		return ResponseEntity.ok().body(obj);// ok: código 404
	}

}

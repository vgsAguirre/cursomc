package com.nelioalves.cursomc.servives;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;
import com.nelioalves.cursomc.servives.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Optional<Categoria> buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! id: " + id
					+ ", Tipo: " + Categoria.class.getName());
		}
		return obj;
	}
	
}

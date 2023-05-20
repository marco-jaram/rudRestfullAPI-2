package com.mtec.service;



import java.util.List;



import com.mtec.model.Tarea;


public interface ITareaService {
public List<Tarea> findAll();
public Tarea save(Tarea tarea);
public Tarea findById(Integer id);
public void delete(Integer id);
	
	
}

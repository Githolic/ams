package gapp.model.dao;

import java.util.List;

import gapp.model.Program;

public interface ProgramDao {
	
	public Program getProgram(String name);
	
	public List<Program> getPrograms();
	
	public Program getProgram(Integer id);
	
	public Program saveProgram(Program program);
	
	public void deleteProgram(Program program);

}

package gapp.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import gapp.model.Program;
import gapp.model.dao.ProgramDao;

@Repository
public class ProgramDaoImpl implements ProgramDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Program getProgram(String name) {
		return entityManager.createQuery("from Program p where .name = ?1", Program.class ).setParameter(1, name).getSingleResult();

	}

	@Override
	public List<Program> getPrograms() {
		return entityManager.createQuery("from Program order by id", Program.class).getResultList();
	}

	@Override
	public Program getProgram(Integer id) {
		
		return entityManager.find(Program.class, id);
	}

	@Override
	@Transactional
	public Program saveProgram(Program program) {
		
		return entityManager.merge(program);
	}

	@Override
	@Transactional
	public void deleteProgram(Program program) {
		
		entityManager.merge(program);
		
	}

}

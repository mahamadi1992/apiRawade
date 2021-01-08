package com.app.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.metier.entities.SoldeDebuterJournee;
@Repository
public interface DaoSoldeDebuter extends JpaRepository<SoldeDebuterJournee,Integer> {
	SoldeDebuterJournee findByIdU(int id);
	SoldeDebuterJournee findById(int userId);
	SoldeDebuterJournee findByIdAndDateAndStatus(int userId,String date,int idU);
	List<SoldeDebuterJournee> findByDateAndIdUAndStatus(String date ,int idU,int status);
}

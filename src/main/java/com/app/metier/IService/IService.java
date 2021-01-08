package com.app.metier.IService;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.app.metier.entities.Connexion;
import com.app.metier.entities.Dates;
import com.app.metier.entities.Majournee;
import com.app.metier.entities.SoldeDebuterJournee;
import com.app.metier.entities.Transaction;
import com.app.metier.entities.Utilisateur;
import com.app.metier.entities.history;
@Component
public interface IService {
	
    //PARTIE CAISSIER-CLIENT
    public List<Dates> getAllDates();
	public void jour();
    public List<Utilisateur> getAllUsers();
    public Utilisateur getUsersById( int userId);
    public Utilisateur createUser(Utilisateur user);
    public Utilisateur updateUser( int userId,  Utilisateur userDetails);
    public Map<String, Boolean> deleteUser( int userId) ;
    public List<SoldeDebuterJournee>getSoldeDebuterJournees( int userId) ;
    public List<SoldeDebuterJournee>getAllSoldeDebuterJournees() ;
    public SoldeDebuterJournee getSoldeDebuterJourneesById( int userId);
    public SoldeDebuterJournee createSoldeDebuterJournee( SoldeDebuterJournee user) ;
    public SoldeDebuterJournee updateSoldeDebuterJournee( int userId,  SoldeDebuterJournee ad);
    public Map<String, Boolean> deleteSoldeDebuterJournee( int userId) ;

    //MAJOURNEE
    public List<Majournee> getMajourneesById( int userId);
    public Majournee updateMajournee( int userId,  Majournee ad);
    public Majournee updateMajournee( int userId,  SoldeDebuterJournee ad);
    public List<Transaction>getAllTransactions();
    public Transaction getTransactionById( int userId);
    public void createTransactions(Transaction user) ;	
    public Transaction updateTransactions( int userId,  Transaction ad);       
    public Map<String, Boolean> deleteTransactions( int userId) ;	
    public Utilisateur seConnecter( Connexion con);	
    public double cloturer( int id,  double con);
    public double sommeFinale( int id);
    public double totalSortie(int id);
    public double totalEntree( int id);
    public double sommeInitiale( int id);
    public double totalDecaissement( int id);
    public double totalEncaissement( int id);
    public double totalCommission( int id);
    public double totalFrais( int id1);
    public List<Transaction>listeTriParOperateur( int id, String operateur);
    public List<Transaction>listeTansactionParCassier( int id_caissier);
    public List<Transaction>listeHistorique(history user);
    public List<Transaction>listeRehercherParOperateur( int id_caissier, String operation);
    public List<Transaction>listeRehercherParOperation(int id_caissier,String operation);
    public void actionPlafonnementDeplafonnement(SoldeDebuterJournee solde,double ancienMontant,String nomOp) ;
    public void calculeActualiser(SoldeDebuterJournee solde,double ancienMontant,String nomOp) ;
		
}

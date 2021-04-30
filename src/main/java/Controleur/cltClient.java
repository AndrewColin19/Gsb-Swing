/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Modele.Medecin;
import Modele.MedecinDAO;
import Modele.Rapport;
import Modele.RapportDAO;
import Modele.VisiteDAO;
import Modele.Visiteur;
import Vue.SaisirScreen;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;


/**
 *
 * @author GODART
 */
public class cltClient {
    
    private RapportDAO rapDAO;
    private static Rapport rap;
    private VisiteDAO visDAO;
    private static Visiteur vis;
    private MedecinDAO medDAO;
    private Medecin med;
    private static boolean source;
    
    public cltClient() throws SQLException{
        rapDAO = new RapportDAO();
        visDAO = new VisiteDAO();
        medDAO = new MedecinDAO();
    }

    public MedecinDAO getMedDAO() {
        return medDAO;
    }

    public void setMedDAO(MedecinDAO medDAO) {
        this.medDAO = medDAO;
    }

    public Medecin getMed() {
        return med;
    }

    public void setMed(Medecin med) {
        this.med = med;
    }

    public RapportDAO getRapDAO() {
        return rapDAO;
    }

    public void setRapDAO(RapportDAO rapDAO) {
        this.rapDAO = rapDAO;
    }

    public static Rapport getRap() {
        return rap;
    }

    public static void setRap(Rapport rapo) {
        rap = rapo;
    }

    public VisiteDAO getVisDAO() {
        return visDAO;
    }

    public void setVisDAO(VisiteDAO visDAO) {
        this.visDAO = visDAO;
    }

    public static Visiteur getVis() {
        return vis;
    }

    public static void setVis(Visiteur visi) {
        vis = visi;
    }

    public static boolean isSource() {
        return source;
    }

    public static void setSource(boolean source) {
        cltClient.source = source;
    }
    
    public void creatNewRapport(JTextArea jTextArea1, JComboBox<String> motifCombo, JComboBox<String> motifCombo1){
        try {
            // TODO add your handling code here:
            // Validate the form
            String unTruc = motifCombo1.getItemAt(motifCombo1.getSelectedIndex()).toString();
            String[] tabSplit = unTruc.split(" : ");
            int mId = Integer.parseInt(tabSplit[0]);
            LocalDate currentDate = LocalDate.now();            
            
            rapDAO.creeRapport(new Rapport(currentDate, motifCombo.getItemAt(motifCombo.getSelectedIndex()).toString(),
                    jTextArea1.getText(), getVis().getVis_id(), mId));
        } catch (SQLException ex) {
            Logger.getLogger(SaisirScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ListModel<String> creeModel(ArrayList laList){
        DefaultListModel<String> leModel = new DefaultListModel();
        for(Object o : laList){
            leModel.addElement(o.toString());
        }
        return leModel;
    }
    public void creeComboModel(ArrayList laList, JComboBox jcombo){
        for(Object o : laList){
            jcombo.addItem(o.toString());
        }
    }
    
    public void selectRapport(JComboBox<String> jComboBox1) throws SQLException{
        String unTruc = jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).toString();
        String[] tabSplit = unTruc.split(" : ");
        rap = rapDAO.getUnRapport(Integer.parseInt(tabSplit[0]));
    }

    public void editRapport(JTextArea jTextArea1, JTextField previewsMotif, JComboBox<String> motif, JComboBox<String> medCombo) throws SQLException {
        String unTruc = medCombo.getItemAt(medCombo.getSelectedIndex()).toString();
        String[] tabSplit = unTruc.split(" : ");
        int mId = Integer.parseInt(tabSplit[0]);
        LocalDate currentDate = LocalDate.now();
        if(!"Entrez un nouveau motif".equals(previewsMotif.getText())){
            rapDAO.modifRapport(new Rapport(rap.getRap_id(), currentDate, previewsMotif.getText(),
                    jTextArea1.getText(), getVis().getVis_id(), mId));
        }
        else{
            rapDAO.modifRapport(new Rapport(rap.getRap_id(), currentDate,motif.getItemAt(motif.getSelectedIndex()).toString(),
                    jTextArea1.getText(), getVis().getVis_id(), mId));
        }
        
    }

    public void consulter(JLabel nomLabel, JLabel prenomLabel, JLabel telLabel, JLabel labelBilan, JLabel labelMotif) throws SQLException{
        Rapport leRap = rapDAO.getUnRapport(rap.getRap_id());
        Visiteur leVis = visDAO.getVisiteurId(rap.getRap_idVisiteur());
        nomLabel.setText(leVis.getVis_nom());
        prenomLabel.setText(leVis.getVis_prenom());
        telLabel.setText(leVis.getVis_adresse());
        labelBilan.setText(leRap.getRap_bilan());
        labelMotif.setText(leRap.getRap_motif());
    }
    
    
}

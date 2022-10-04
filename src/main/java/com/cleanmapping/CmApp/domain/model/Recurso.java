/**
 * FastFood API
 * API básica para melhoria e implementação.
 * 
 * Classe Recurso
 */
package com.cleanmapping.CmApp.domain.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 *
 * @author Equipe Clean Mapping - Kaylane e Renan
 */
@Entity
public class Recurso {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)             
    private long idRecurso;
    
    private String obs;
    private String descricao;
    private String nomeRecurso;
    private int numero;
    
    @Enumerated(EnumType.STRING)
    private StatusRecurso status;

    public Recurso() {
    }

    public Recurso(long idRecurso, String nomeRecurso, int numero, String obs, String descricao) {
        this.idRecurso = idRecurso;
        this.nomeRecurso = nomeRecurso;
        this.numero = numero;
        this.obs = obs;
        this.descricao = descricao;
    }

    public long getIdRecurso() {
        return idRecurso;
    }

    public void setIdRecurso(long idRecurso) {
        this.idRecurso = idRecurso;
    }

    public String getNomeRecurso() {
        return nomeRecurso;
    }

    public void setNomeRecurso(String nomeRecurso) {
        this.nomeRecurso = nomeRecurso;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusRecurso getStatus() {
        return status;
    }

    public void setStatus(StatusRecurso status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + (int) (this.idRecurso ^ (this.idRecurso >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Recurso other = (Recurso) obj;
        return this.idRecurso == other.idRecurso;
    }
    
    
}

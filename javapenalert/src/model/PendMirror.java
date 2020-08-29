/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author samuel
 */
public class PendMirror {
    private String makeId;
    private String email;
    private String brn;
    private String refNo;
    private String authStat;
    private String timeCreated;
    private String module;

    public PendMirror() {
    }

    public PendMirror(String makeId, String email, String brn, String refNo, String authStat, String timeCreated, String module) {
        this.makeId = makeId;
        this.email = email;
        this.brn = brn;
        this.refNo = refNo;
        this.authStat = authStat;
        this.timeCreated = timeCreated;
        this.module = module;
    }

    public String getMakeId() {
        return makeId;
    }

    public void setMakeId(String makeId) {
        this.makeId = makeId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getBrn() {
        return brn;
    }

    public void setBrn(String brn) {
        this.brn = brn;
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public String getAuthStat() {
        return authStat;
    }

    public void setAuthStat(String authStat) {
        this.authStat = authStat;
    }

    public String getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

}

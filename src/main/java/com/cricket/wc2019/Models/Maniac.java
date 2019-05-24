package com.cricket.wc2019.Models;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
@Component
public class Maniac {

    @Id
    private String maniac_name;
    private int total_score;
    private String orange_cap;
    private String purple_cap;
    private String opener1;
    private String opener2;
    private String opener3;
    private String opener4;
    private String middle_order1;
    private String middle_order2;
    private String middle_order3;
    private String middle_order4;
    private String middle_order5;
    private String middle_order6;
    private String allrounder1;
    private String allrounder2;
    private String fast_bower1;
    private String fast_bower2;
    private String fast_bower3;
    private String fast_bower4;
    private String fast_bower5;
    private String spinner1;
    private String spinner2;
    private String spinner3;
    private String wicketkeeper1;
    private String wicketkeeper2;


    public String getManiac_name() {
        return maniac_name;
    }

    public void setManiac_name(String maniac_name) {
        this.maniac_name = maniac_name;
    }

    public int getTotal_score() {
        return total_score;
    }

    public void setTotal_score(int total_score) {
        this.total_score = total_score;
    }

    public String getOrange_cap() {
        return orange_cap;
    }

    public void setOrange_cap(String orange_cap) {
        this.orange_cap = orange_cap;
    }

    public String getPurple_cap() {
        return purple_cap;
    }

    public void setPurple_cap(String purple_cap) {
        this.purple_cap = purple_cap;
    }

    public String getOpener1() {
        return opener1;
    }

    public void setOpener1(String opener1) {
        this.opener1 = opener1;
    }

    public String getOpener2() {
        return opener2;
    }

    public void setOpener2(String opener2) {
        this.opener2 = opener2;
    }

    public String getOpener3() {
        return opener3;
    }

    public void setOpener3(String opener3) {
        this.opener3 = opener3;
    }

    public String getOpener4() {
        return opener4;
    }

    public void setOpener4(String opener4) {
        this.opener4 = opener4;
    }

    public String getMiddle_order1() {
        return middle_order1;
    }

    public void setMiddle_order1(String middle_order1) {
        this.middle_order1 = middle_order1;
    }

    public String getMiddle_order2() {
        return middle_order2;
    }

    public void setMiddle_order2(String middle_order2) {
        this.middle_order2 = middle_order2;
    }

    public String getMiddle_order3() {
        return middle_order3;
    }

    public void setMiddle_order3(String middle_order3) {
        this.middle_order3 = middle_order3;
    }

    public String getMiddle_order4() {
        return middle_order4;
    }

    public void setMiddle_order4(String middle_order4) {
        this.middle_order4 = middle_order4;
    }

    public String getMiddle_order5() {
        return middle_order5;
    }

    public void setMiddle_order5(String middle_order5) {
        this.middle_order5 = middle_order5;
    }

    public String getMiddle_order6() {
        return middle_order6;
    }

    public void setMiddle_order6(String middle_order6) {
        this.middle_order6 = middle_order6;
    }

    public String getAllrounder1() {
        return allrounder1;
    }

    public void setAllrounder1(String allrounder1) {
        this.allrounder1 = allrounder1;
    }

    public String getAllrounder2() {
        return allrounder2;
    }

    public void setAllrounder2(String allrounder2) {
        this.allrounder2 = allrounder2;
    }

    public String getFast_bower1() {
        return fast_bower1;
    }

    public void setFast_bower1(String fast_bower1) {
        this.fast_bower1 = fast_bower1;
    }

    public String getFast_bower2() {
        return fast_bower2;
    }

    public void setFast_bower2(String fast_bower2) {
        this.fast_bower2 = fast_bower2;
    }

    public String getFast_bower3() {
        return fast_bower3;
    }

    public void setFast_bower3(String fast_bower3) {
        this.fast_bower3 = fast_bower3;
    }

    public String getFast_bower4() {
        return fast_bower4;
    }

    public void setFast_bower4(String fast_bower4) {
        this.fast_bower4 = fast_bower4;
    }

    public String getFast_bower5() {
        return fast_bower5;
    }

    public void setFast_bower5(String fast_bower5) {
        this.fast_bower5 = fast_bower5;
    }

    public String getSpinner1() {
        return spinner1;
    }

    public void setSpinner1(String spinner1) {
        this.spinner1 = spinner1;
    }

    public String getSpinner2() {
        return spinner2;
    }

    public void setSpinner2(String spinner2) {
        this.spinner2 = spinner2;
    }

    public String getSpinner3() {
        return spinner3;
    }

    public void setSpinner3(String spinner3) {
        this.spinner3 = spinner3;
    }

    public String getWicketkeeper1() {
        return wicketkeeper1;
    }

    public void setWicketkeeper1(String wicketkeeper1) {
        this.wicketkeeper1 = wicketkeeper1;
    }

    public String getWicketkeeper2() {
        return wicketkeeper2;
    }

    public void setWicketkeeper2(String wicketkeeper2) {
        this.wicketkeeper2 = wicketkeeper2;
    }
}

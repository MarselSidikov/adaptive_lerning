package ru.kpfu.ivmiit.learning.tools.models;

import java.util.ArrayList;

/**
 * @author Ilnar Ramazanov (Kazan Federal University)
 */
public class Test {
  private ArrayList<String> questions;
    public Test(){
    questions = new ArrayList<String>();
  }
  public void setQuestions(ArrayList<String> questions){
    this.questions = questions;
  }
  public ArrayList<String> getQuestions(){
    return questions;
  }
}
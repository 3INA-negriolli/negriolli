package teoria;

 public class Automobile {
  private String targa;
  private boolean avviata;

  public Automobile(String targa, boolean avviata){
	this.targa = targa;
	this.avviata = avviata;
}

  public String getTarga(){
	  return targa;
  }

  public boolean getAvviata(){
	  return avviata;
  }

  public void setAvviata(boolean avviata){
	  this.avviata = avviata;
  }
	

}

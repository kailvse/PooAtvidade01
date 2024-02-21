public class Pessoa {

   private String nome;
   private int idade;
   private char sexo;
   private double peso;
   private String corOlhos;
   private String corCabelos;
   private double altura;

   public Pessoa(){

   }

   public Pessoa(String nome){
    this.nome = nome;
   }
   
   public Pessoa(String nome, int idade, char sexo, double peso, String corOlhos, String corCabelos, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.sexo = sexo;
    this.peso = peso;
    this.corOlhos = corOlhos;
    this.corCabelos = corCabelos;
    this.altura = altura;
}
public String getNome() {
    return nome;
}
public int getIdade() {
    return idade;
}
public char getSexo() {
    return sexo;
}
public double getPeso() {
    return peso;
}
public String getCorOlhos() {
    return corOlhos;
}
public String getCorCabelos() {
    return corCabelos;
}
public double getAltura() {
    return altura;
}
public void setNome(String nome) {
    this.nome = nome;
}
public void setIdade(int idade) {
    this.idade = idade;
}
public void setSexo(char sexo) {
    this.sexo = sexo;
}
public void setPeso(double peso) {
    this.peso = peso;
}
public void setCorOlhos(String corOlhos) {
    this.corOlhos = corOlhos;
}
public void setCorCabelos(String corCabelos) {
    this.corCabelos = corCabelos;
}
public void setAltura(double altura) {
    this.altura = altura;
}




}
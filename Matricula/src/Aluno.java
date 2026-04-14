public class Aluno {
    private String nome;
    private int numeroMatricula;
    private String curso;
    private String[] materia = new String[3];
    private double[] notas = new double[3];

    public Aluno(String nome, int numeroMatricula, String curso){
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
        this.curso = curso;
    }

    public boolean aprovado (int index) {
        return notas[index] >= 7.0;
    }

    public String getNome (){return  nome;}
    public void setNome (String nome){this.nome = nome ;}

    public int getNumeroMatricula () {return numeroMatricula;}
    public void setNumeroMatricula (int numeroMatricula){this.numeroMatricula = numeroMatricula;}

    public String getCurso () {return curso;}
    public void setCurso (String curso) {this.curso = curso;}

    public void setMateriaNota(int index, String nomeMat, double nota) {
        this.materia[index] = nomeMat;
        this.notas[index] = nota;
    }

    public String getDisciplina(int i) { return materia[i]; }
    public double getNota(int i) { return notas[i]; }


}

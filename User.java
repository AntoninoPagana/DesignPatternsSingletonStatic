public class User {
    public static User user;

    public static User getUser(){
        if(user == null){
            user = new User();
        }
        return user;
    }
    private String nome;
    private Integer eta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    public void stampaInformazioni() {
        System.out.println("Nome: " + nome + ", Eta:" + eta);
    }

    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }
}

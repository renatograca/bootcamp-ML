package corridaMaluca;

public enum Categoria {

    PEQUENA("2Km pela selva e riacho"),
    MEDIA("5Km pela selva, riachos e lama"),
    AVANCADA("10Km pela selva, riachos, lama e escalada");

    private String descricao;

    Categoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

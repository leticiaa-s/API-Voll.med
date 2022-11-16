package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco endereco) {
        this.logradouro = endereco.logradouro();
        this.bairro = endereco.bairro();
        this.cidade = endereco.cidade();
        this.cep = endereco.cep();
        this.complemento = endereco.complemento();
        this.numero = endereco.numero();
        this.uf = endereco.uf();
    }

    public void atualizarInformacoes(DadosEndereco dados) {
        if (dados.logradouro() != null){
            this.logradouro = dados.logradouro();
        }
        if (dados.bairro() != null){
            this.bairro = dados.bairro();
        }if (dados.logradouro() != null){
            this.cidade = dados.cidade();
        }if (dados.cidade() != null){
            this.cep = dados.cep();
        }if (dados.complemento() != null){
            this.complemento = dados.complemento();
        }if (dados.numero() != null){
            this.numero = dados.numero();
        }
    }
}

package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.DadosAtualizacaoEndereco;

public record DadosAtualizacaoMedico(
        @NotNull long id,
        String nome,
        String telefone,
        @Valid DadosAtualizacaoEndereco endereco) {
}

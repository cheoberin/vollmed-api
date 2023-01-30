package med.voll.api.domain.paciente;

import jakarta.persistence.Column;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;
import org.hibernate.validator.constraints.br.CPF;

public record DadosCadastraisPaciente(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        @Column(unique = true)
        String email,
        @NotBlank
        @Pattern(regexp = "\\d{8,20}")
        String telefone,
        @NotBlank
        @CPF
        String cpf,
        @NotNull
        @Valid
        DadosEndereco endereco) {
}

package med.voll.api.domain.medico;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastraisMedico(
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
        @Column(unique = true)
        @Pattern(regexp = "\\d{4,6}")
        String crm,
        @NotNull
        @Enumerated(EnumType.STRING)
        Especialidade especialidade,
        @NotNull
        @Valid
        DadosEndereco endereco) {
}

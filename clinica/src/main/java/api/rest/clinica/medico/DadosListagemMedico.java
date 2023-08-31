package api.rest.clinica.medico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;

public record DadosListagemMedico(

    @NotBlank
    @Length(max = 100)
    String nome,

    @NotBlank
    @Length(max = 100)
    String email,

    @NotBlank
    @Length(max = 6)
    @Pattern(regexp = "\\d{4,6}")
    String crm,

    @NotBlank
    @Length(max = 100)
    Especialidade especialidade

) {
    public DadosListagemMedico(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}

package fr.husta.test.ex5;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Uses Hibernate Validator custom constraints : @NotEmpty and @NotBlank. <br>
 * Warning :  @NotBlank not available in Hibernate-Validator < 4.1.0.Final
 * 
 * @author HUSTA
 *
 */
public class PersonWithHibValidatorConstraints
{

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotBlank
    private String firstName;

    public PersonWithHibValidatorConstraints()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

}

package com.example.apiMarketplace.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //O valor do id será gerado automaticamente pelo banco.
    private Long id;

    @NotBlank(message = "Nome obrigatótio") //Nome é obrigatório - Valida que o campo nome não pode ser nulo ou vazio.
    @Size(min = 3, max = 100, message = "Nome deve ter entre 3 e 100 caracteres")
    private String name;
    
    @NotBlank(message = "Descrição obrigatória")//Descrição é obrigatória - Valida que o campo descricao não pode ser nulo ou vazio.
    @Size(min = 3, max = 100, message = "Descrição deve ter entre 3 e 100 caracteres") //Descrição deve ter entre 3 e 100 caracteres - Valida que o campo descricao deve conter entre 3 e 100 caracteres.
    private String description;

    @NotNull(message = "Preço é obrigatório")
    @DecimalMin(value = "0.0", inclusive = true, message = "Preço deve ser maior ou igual a zero")//Preço é obrigatório - Valida que o campo price não pode ser nulo. Preço deve ser maior que zero - Valida que o campo price deve ser um valor positivo.
    private double price;

    @NotNull(message = "Quantidade é obrigatória")
    @Min(value = 0, message = "Quantidade deve ser maior ou igual a zero")//Quantidade é obrigatória - Valida que o campo quantity não pode ser nulo. Quantidade deve ser maior ou igual a zero - Valida que o campo quantity deve ser um valor inteiro positivo ou zero.
    private int quantity;


}

package com.example.classes;

public class IMC
{
    private float altura;
    private float peso;
    private String nome;

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float calcularIMC()
    {
        float imc = getPeso()/(getAltura()*getAltura());
        return imc;
    }

}

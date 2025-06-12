package academy.devdojo.maratonaDevDojo.introducao;

/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args){
        String nome = "josué";
        String endereco = "avenida jovem 2";
        double salario = 1232.50;
        String dataRecebimento = "12/11/2022";
        String mensagemRelatorio = "Eu "+nome+", morando no endereço " +endereco+", confirmo que recebi o salário de "+salario+", na data "+dataRecebimento;

        System.out.println(mensagemRelatorio);

    }
}

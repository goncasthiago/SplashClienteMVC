package br.com.goncasthiago.semana02aula05clientemvc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.goncasthiago.semana02aula05clientemvc.controller.ClienteController;
import br.com.goncasthiago.semana02aula05clientemvc.model.Cliente;

public class MainActivity extends AppCompatActivity {

// Criação do objeto Cliente

    Cliente objCliente;
    ClienteController clienteController;

    Button btnSalvar, btnLimpar;
    EditText editNome, editCidade, editUF, editProfissao, editEmpresa, editTelefone, editEmail;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        objCliente = new Cliente();
        clienteController = new ClienteController();

        //Vinculando os ID com os objetos

        btnSalvar = (Button) findViewById(R.id.btnSalvar);
        btnLimpar = (Button) findViewById(R.id.btnLimpar);
        editNome = (EditText) findViewById(R.id.editNome);
        editCidade = (EditText) findViewById(R.id.editCidade);
        editUF = (EditText) findViewById(R.id.editUF);
        editProfissao = (EditText) findViewById(R.id.editProfissao);
        editEmpresa = (EditText) findViewById(R.id.editEmpresa);
        editTelefone = (EditText) findViewById(R.id.editTelefone);
        editEmail = (EditText) findViewById(R.id.editEmail);

        //Capturando o clique no botão btnSalvar

        btnSalvar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
            popularObjeto();
            //Apresentando uma mensagem para o usuário
            clienteController.salvarCliente(objCliente);

                Toast.makeText(getApplicationContext(),
                        clienteController.toString(),
                        Toast.LENGTH_LONG).show();
            }
            }
        );

        btnLimpar.setOnClickListener(new View.OnClickListener() {

                                         @Override
                                         public void onClick(View view) {

                                             clienteController.limparCliente();
                                             limparObjeto();

                                             //Apresentando uma mensagem para o usuário
                                             Toast.makeText(getApplicationContext(), "Formulário Limpo!", Toast.LENGTH_LONG).show();
                                         }
                                     }
        );
    }

    public void popularObjeto(){

        objCliente.setNome(editNome.getText().toString());
        objCliente.setCidade(editCidade.getText().toString());
        objCliente.setUf(editUF.getText().toString());
        objCliente.setEmail(editEmail.getText().toString());
        objCliente.setEmpresa(editEmpresa.getText().toString());
        objCliente.setTelefone(editTelefone.getText().toString());
        objCliente.setProfissao(editProfissao.getText().toString());
    }

    private void limparObjeto(){

        //Limpa o Formulario

        editNome.setText("");
        editCidade.setText("");
        editUF.setText("");
        editProfissao.setText("");
        editEmpresa.setText("");
        editTelefone.setText("");
        editEmail.setText("");


    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}


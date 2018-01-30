package br.com.erich.listacomasynctask.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by logonrm on 29/01/2018.
 */

public class Android implements Parcelable {

    public static final String TAG_ANDROID = "android";
    public static final String TAG_NOME = "nome";
    public static final String TAG_VERSAO = "versao";
    public static final String TAG_API = "api";
    public static final String TAG_URL_IMAGEM = "urlImagem";

    private String nome;
    private String api;
    private String urlImagem;
    private String versao;

    public Android() {

    }

    protected Android(Parcel in) {
        nome = in.readString();
        api = in.readString();
        urlImagem = in.readString();
        versao = in.readString();
    }

    public static final Creator<Android> CREATOR = new Creator<Android>() {
        @Override
        public Android createFromParcel(Parcel in) {
            return new Android(in);
        }

        @Override
        public Android[] newArray(int size) {
            return new Android[size];
        }
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeString(api);
        dest.writeString(urlImagem);
        dest.writeString(versao);
    }
}

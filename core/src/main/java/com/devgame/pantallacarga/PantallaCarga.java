package com.devgame.pantallacarga;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.devgame.image.Image;
import com.devgame.menu.Menu;
import com.devgame.recurso.Recurso;
import com.devgame.render.Render;

public class PantallaCarga implements Screen {

    Image img;
    SpriteBatch batch;
    float alpha = 0f;
    float contTiempo = 0, tiempoEspera=5;
    boolean fadeInterminado=false,termino=false;


    @Override
    public void show() {
        img = new Image(Recurso.FONDO);
        batch = Render.batch;
        img.setTransparencia(alpha);
    }

    @Override
    public void render(float v) {
        limpiarPantalla();
        batch.begin();
        procesarAlpha();
        img.dibujar();
        batch.end();
    }

    @Override
    public void resize(int i, int i1) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
    public void setTransparencia(float alpha){
        img.setTransparencia(alpha);
    }

     public void procesarAlpha() {
        if(!fadeInterminado){
            alpha+=0.005f;
            if(alpha>1){
                alpha=1;
                fadeInterminado=true;
            }
        }
       else{
            contTiempo+=0.02f;
            if(contTiempo>tiempoEspera){
                alpha-=0.01f;
                if(alpha<0){
                    alpha=0;
                    termino=true;
                }
        }
       }
         setTransparencia(alpha);
       if(timeOver()){
           Render.main.setScreen(new Menu());
       }
     }

    public void limpiarPantalla(){
        Gdx.gl.glClearColor(0,0,0,0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

    }

    public boolean timeOver() {
        System.out.println("Termino");
        return termino;
    }
}

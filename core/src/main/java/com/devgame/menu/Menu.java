package com.devgame.menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.devgame.image.Image;
import com.devgame.recurso.Recurso;
import com.devgame.render.Render;

public class Menu implements Screen {
    Image img;
    SpriteBatch batch;
    float alpha = 0f;
    float contTiempo = 0, tiempoEspera=5;
    float contTiempoTermina=0,tiempoTermina=5;
    boolean fadeInterminado=false,termino=true;

    @Override
    public void show() {
        img = new Image(Recurso.MENU);
        batch = Render.batch;
        img.setTransparencia(alpha);

    }

    @Override
    public void render(float delta) {
        limpiarPantalla();
        batch.begin();
        procesarAlpha();
        img.dibujar();
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

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
            alpha+=0.01f;
            if(alpha>1){
                alpha=1;
                fadeInterminado=true;
            }
        }

        setTransparencia(alpha);
    }

    public void limpiarPantalla(){
        Gdx.gl.glClearColor(0,0,0,0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

    }
}

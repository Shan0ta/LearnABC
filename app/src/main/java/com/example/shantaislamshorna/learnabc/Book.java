package com.example.shantaislamshorna.learnabc;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class Book extends AppCompatActivity implements View.OnClickListener {
    Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
    MediaPlayer auido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        a = (Button) findViewById(R.id.a);
        b = (Button) findViewById(R.id.b);
        c = (Button) findViewById(R.id.c);
        d = (Button) findViewById(R.id.d);
        e = (Button) findViewById(R.id.e);
        f = (Button) findViewById(R.id.f);
        g = (Button) findViewById(R.id.g);
        h = (Button) findViewById(R.id.h);
        i = (Button) findViewById(R.id.i);
        j = (Button) findViewById(R.id.j);
        k = (Button) findViewById(R.id.k);
        l = (Button) findViewById(R.id.l);
        m = (Button) findViewById(R.id.m);
        n = (Button) findViewById(R.id.n);
        o = (Button) findViewById(R.id.o);
        p = (Button) findViewById(R.id.p);
        q = (Button) findViewById(R.id.q);
        r = (Button) findViewById(R.id.r);
        s = (Button) findViewById(R.id.s);
        t = (Button) findViewById(R.id.t);
        u = (Button) findViewById(R.id.u);
        v = (Button) findViewById(R.id.v);
        w = (Button) findViewById(R.id.w);
        x = (Button) findViewById(R.id.x);
        y = (Button) findViewById(R.id.y);
        z = (Button) findViewById(R.id.z);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        v.setOnClickListener(this);
        w.setOnClickListener(this);
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        z.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.a:

                auido = MediaPlayer.create(getApplicationContext(),R.raw.a);
                auido.start();

                break;
            case R.id.b:
                auido = MediaPlayer.create(getApplicationContext(),R.raw.b);
                auido.start();

                break;
            case R.id.c:
                auido = MediaPlayer.create(getApplicationContext(),R.raw.c);
                auido.start();

                break;
            case R.id.d:
                auido = MediaPlayer.create(getApplicationContext(),R.raw.d);
                auido.start();

                break;
            case R.id.e:
                auido = MediaPlayer.create(getApplicationContext(),R.raw.e);
                auido.start();

                break;
            case R.id.f:
                auido = MediaPlayer.create(getApplicationContext(),R.raw.f);
                auido.start();

                break;
            case R.id.g:
                auido = MediaPlayer.create(getApplicationContext(),R.raw.g);
                auido.start();

                break;
            case R.id.h:
                auido = MediaPlayer.create(getApplicationContext(),R.raw.h);
                auido.start();

                break;
            case R.id.i:
                auido = MediaPlayer.create(getApplicationContext(),R.raw.i);
                auido.start();
                break;
            case R.id.j:
                auido = MediaPlayer.create(getApplicationContext(),R.raw.j);
                auido.start();
                break;
            case R.id.k:
                auido = MediaPlayer.create(getApplicationContext(),R.raw.k);
                auido.start();
                break;
            case R.id.l:
                auido = MediaPlayer.create(getApplicationContext(),R.raw.l);
                auido.start();
                break;
            case R.id.m:
                auido = MediaPlayer.create(getApplicationContext(),R.raw.m);
                auido.start();
                break;
            case R.id.n:
                auido = MediaPlayer.create(getApplicationContext(),R.raw.n);
                auido.start();
                break;
            case R.id.o:
                auido = MediaPlayer.create(getApplicationContext(),R.raw.o);
                auido.start();
                break;
            case R.id.p:
                auido = MediaPlayer.create(getApplicationContext(),R.raw.p);
                auido.start();
                break;
            case R.id.q:
                auido = MediaPlayer.create(getApplicationContext(),R.raw.q);
                auido.start();
                break;
            case R.id.r:
                auido = MediaPlayer.create(getApplicationContext(),R.raw.r);
                auido.start();
                break;
            case R.id.s:
                auido = MediaPlayer.create(getApplicationContext(),R.raw.s);
                auido.start();
                break;
            case R.id.t:
                auido = MediaPlayer.create(getApplicationContext(),R.raw.t);
                auido.start();
                break;
            case R.id.u:
                auido = MediaPlayer.create(getApplicationContext(),R.raw.u);
                auido.start();
                break;
            case R.id.v:
                auido = MediaPlayer.create(getApplicationContext(),R.raw.v);
                auido.start();
                break;
            case R.id.w:
                auido = MediaPlayer.create(getApplicationContext(),R.raw.w);
                auido.start();
                break;
            case R.id.x:
                auido = MediaPlayer.create(getApplicationContext(),R.raw.x);
                auido.start();
                break;
            case R.id.y:
                auido = MediaPlayer.create(getApplicationContext(),R.raw.y);
                auido.start();
                break;
            case R.id.z:
                auido = MediaPlayer.create(getApplicationContext(),R.raw.z);
                auido.start();
                break;
        }
    }
}

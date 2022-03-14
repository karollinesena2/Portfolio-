package one.digitalinovation.gof;

import one.digitalinovation.gof.Facade.Facade;
import one.digitalinovation.gof.Singleton.SingletonEager;
import one.digitalinovation.gof.Singleton.SingletonLazy;
import one.digitalinovation.gof.Singleton.SingletonLazyHolder;
import one.digitalinovation.gof.Strategy.*;
import one.digitalinovation.gof.Strategy.Comportamento;
import one.digitalinovation.gof.Strategy.Robo;

public class Test {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getIntancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getIntancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder  lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();

        //facade

        Facade facade = new Facade();
        facade.migrarCliente("karol","78070000");

    }
}

package lab9;

import reactor.core.publisher.Flux;

import java.time.Duration;

public class Challange1 {
    private Flux<String> emptyFlux(){
return Flux.empty();
    }
    private Flux<String> foobarFlux(){
        return Flux.just("foo","bar");
    }
    private Flux<Integer> intervalFlux(int i, int j){
        return Flux.interval(Duration.ofMillis(100)).range(i,j);
    }

    public static void main(String[] args) {
        Challange1 ch = new Challange1();
        ch.emptyFlux().subscribe(t -> System.out.println(t));

        System.out.println("foobarFlux result:");
        ch.foobarFlux().subscribe(t -> System.out.println(t));

        System.out.println("intervalFlux result:");
        ch.intervalFlux(0,10).subscribe(t -> System.out.println(t));
    }
}

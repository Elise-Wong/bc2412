import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface SuperFunction<T, U, V, R> {
  R apply(T t, U u, V v);

  //可以不用以下的coding:
  default <W> SuperFunction<T, U, V, W> andThen(Function<? super R, ? extends W> after){
    Objects.requireNonNull(after);
    return (T t, U u, V v) -> after.apply(apply(t, u, v));
  }
  


}

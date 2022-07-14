package com.palantir.docker.compose.execution;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link DockerComposeExecArgument}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDockerComposeExecArgument.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableDockerComposeExecArgument.of()}.
 */
@SuppressWarnings("all")
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "DockerComposeExecArgument"})
@Immutable
public final class ImmutableDockerComposeExecArgument
    extends DockerComposeExecArgument {
  private final ImmutableList<String> arguments;

  private ImmutableDockerComposeExecArgument(Iterable<String> arguments) {
    this.arguments = ImmutableList.copyOf(arguments);
  }

  private ImmutableDockerComposeExecArgument(
      ImmutableDockerComposeExecArgument original,
      ImmutableList<String> arguments) {
    this.arguments = arguments;
  }

  /**
   * @return The value of the {@code arguments} attribute
   */
  @Override
  public ImmutableList<String> arguments() {
    return arguments;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link DockerComposeExecArgument#arguments() arguments}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDockerComposeExecArgument withArguments(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableDockerComposeExecArgument(this, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link DockerComposeExecArgument#arguments() arguments}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of arguments elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDockerComposeExecArgument withArguments(Iterable<String> elements) {
    if (this.arguments == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableDockerComposeExecArgument(this, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDockerComposeExecArgument} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDockerComposeExecArgument
        && equalTo((ImmutableDockerComposeExecArgument) another);
  }

  private boolean equalTo(ImmutableDockerComposeExecArgument another) {
    return arguments.equals(another.arguments);
  }

  /**
   * Computes a hash code from attributes: {@code arguments}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + arguments.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code DockerComposeExecArgument...} with all non-generated
   * and non-auxiliary attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("DockerComposeExecArgument")
        .add("arguments", arguments)
        .toString();
  }

  /**
   * Construct a new immutable {@code DockerComposeExecArgument} instance.
   * @param arguments The value for the {@code arguments} attribute
   * @return An immutable DockerComposeExecArgument instance
   */
  public static ImmutableDockerComposeExecArgument of(List<String> arguments) {
    return of((Iterable<String>) arguments);
  }

  /**
   * Construct a new immutable {@code DockerComposeExecArgument} instance.
   * @param arguments The value for the {@code arguments} attribute
   * @return An immutable DockerComposeExecArgument instance
   */
  public static ImmutableDockerComposeExecArgument of(Iterable<String> arguments) {
    return new ImmutableDockerComposeExecArgument(arguments);
  }

  /**
   * Creates an immutable copy of a {@link DockerComposeExecArgument} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DockerComposeExecArgument instance
   */
  public static ImmutableDockerComposeExecArgument copyOf(DockerComposeExecArgument instance) {
    if (instance instanceof ImmutableDockerComposeExecArgument) {
      return (ImmutableDockerComposeExecArgument) instance;
    }
    return ImmutableDockerComposeExecArgument.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableDockerComposeExecArgument ImmutableDockerComposeExecArgument}.
   * @return A new ImmutableDockerComposeExecArgument builder
   */
  public static ImmutableDockerComposeExecArgument.Builder builder() {
    return new ImmutableDockerComposeExecArgument.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableDockerComposeExecArgument ImmutableDockerComposeExecArgument}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private ImmutableList.Builder<String> argumentsBuilder = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code DockerComposeExecArgument} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DockerComposeExecArgument instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllArguments(instance.arguments());
      return this;
    }

    /**
     * Adds one element to {@link DockerComposeExecArgument#arguments() arguments} list.
     * @param element A arguments element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addArguments(String element) {
      argumentsBuilder.add(element);
      return this;
    }

    /**
     * Adds elements to {@link DockerComposeExecArgument#arguments() arguments} list.
     * @param elements An array of arguments elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addArguments(String... elements) {
      argumentsBuilder.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link DockerComposeExecArgument#arguments() arguments} list.
     * @param elements An iterable of arguments elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder arguments(Iterable<String> elements) {
      argumentsBuilder = ImmutableList.builder();
      return addAllArguments(elements);
    }

    /**
     * Adds elements to {@link DockerComposeExecArgument#arguments() arguments} list.
     * @param elements An iterable of arguments elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllArguments(Iterable<String> elements) {
      argumentsBuilder.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableDockerComposeExecArgument ImmutableDockerComposeExecArgument}.
     * @return An immutable instance of DockerComposeExecArgument
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableDockerComposeExecArgument build() {
      return new ImmutableDockerComposeExecArgument(null, argumentsBuilder.build());
    }
  }
}

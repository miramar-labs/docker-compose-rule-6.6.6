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
 * Immutable implementation of {@link DockerComposeRunArgument}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDockerComposeRunArgument.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableDockerComposeRunArgument.of()}.
 */
@SuppressWarnings("all")
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "DockerComposeRunArgument"})
@Immutable
public final class ImmutableDockerComposeRunArgument
    extends DockerComposeRunArgument {
  private final ImmutableList<String> arguments;

  private ImmutableDockerComposeRunArgument(Iterable<String> arguments) {
    this.arguments = ImmutableList.copyOf(arguments);
  }

  private ImmutableDockerComposeRunArgument(
      ImmutableDockerComposeRunArgument original,
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
   * Copy the current immutable object with elements that replace the content of {@link DockerComposeRunArgument#arguments() arguments}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDockerComposeRunArgument withArguments(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableDockerComposeRunArgument(this, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link DockerComposeRunArgument#arguments() arguments}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of arguments elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDockerComposeRunArgument withArguments(Iterable<String> elements) {
    if (this.arguments == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableDockerComposeRunArgument(this, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDockerComposeRunArgument} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDockerComposeRunArgument
        && equalTo((ImmutableDockerComposeRunArgument) another);
  }

  private boolean equalTo(ImmutableDockerComposeRunArgument another) {
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
   * Prints the immutable value {@code DockerComposeRunArgument...} with all non-generated
   * and non-auxiliary attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("DockerComposeRunArgument")
        .add("arguments", arguments)
        .toString();
  }

  /**
   * Construct a new immutable {@code DockerComposeRunArgument} instance.
   * @param arguments The value for the {@code arguments} attribute
   * @return An immutable DockerComposeRunArgument instance
   */
  public static ImmutableDockerComposeRunArgument of(List<String> arguments) {
    return of((Iterable<String>) arguments);
  }

  /**
   * Construct a new immutable {@code DockerComposeRunArgument} instance.
   * @param arguments The value for the {@code arguments} attribute
   * @return An immutable DockerComposeRunArgument instance
   */
  public static ImmutableDockerComposeRunArgument of(Iterable<String> arguments) {
    return new ImmutableDockerComposeRunArgument(arguments);
  }

  /**
   * Creates an immutable copy of a {@link DockerComposeRunArgument} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DockerComposeRunArgument instance
   */
  public static ImmutableDockerComposeRunArgument copyOf(DockerComposeRunArgument instance) {
    if (instance instanceof ImmutableDockerComposeRunArgument) {
      return (ImmutableDockerComposeRunArgument) instance;
    }
    return ImmutableDockerComposeRunArgument.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableDockerComposeRunArgument ImmutableDockerComposeRunArgument}.
   * @return A new ImmutableDockerComposeRunArgument builder
   */
  public static ImmutableDockerComposeRunArgument.Builder builder() {
    return new ImmutableDockerComposeRunArgument.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableDockerComposeRunArgument ImmutableDockerComposeRunArgument}.
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
     * Fill a builder with attribute values from the provided {@code DockerComposeRunArgument} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DockerComposeRunArgument instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllArguments(instance.arguments());
      return this;
    }

    /**
     * Adds one element to {@link DockerComposeRunArgument#arguments() arguments} list.
     * @param element A arguments element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addArguments(String element) {
      argumentsBuilder.add(element);
      return this;
    }

    /**
     * Adds elements to {@link DockerComposeRunArgument#arguments() arguments} list.
     * @param elements An array of arguments elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addArguments(String... elements) {
      argumentsBuilder.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link DockerComposeRunArgument#arguments() arguments} list.
     * @param elements An iterable of arguments elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder arguments(Iterable<String> elements) {
      argumentsBuilder = ImmutableList.builder();
      return addAllArguments(elements);
    }

    /**
     * Adds elements to {@link DockerComposeRunArgument#arguments() arguments} list.
     * @param elements An iterable of arguments elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllArguments(Iterable<String> elements) {
      argumentsBuilder.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableDockerComposeRunArgument ImmutableDockerComposeRunArgument}.
     * @return An immutable instance of DockerComposeRunArgument
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableDockerComposeRunArgument build() {
      return new ImmutableDockerComposeRunArgument(null, argumentsBuilder.build());
    }
  }
}

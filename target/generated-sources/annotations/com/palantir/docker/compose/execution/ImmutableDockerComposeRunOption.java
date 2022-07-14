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
 * Immutable implementation of {@link DockerComposeRunOption}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDockerComposeRunOption.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableDockerComposeRunOption.of()}.
 */
@SuppressWarnings("all")
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "DockerComposeRunOption"})
@Immutable
public final class ImmutableDockerComposeRunOption
    extends DockerComposeRunOption {
  private final ImmutableList<String> options;

  private ImmutableDockerComposeRunOption(Iterable<String> options) {
    this.options = ImmutableList.copyOf(options);
  }

  private ImmutableDockerComposeRunOption(
      ImmutableDockerComposeRunOption original,
      ImmutableList<String> options) {
    this.options = options;
  }

  /**
   * @return The value of the {@code options} attribute
   */
  @Override
  public ImmutableList<String> options() {
    return options;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link DockerComposeRunOption#options() options}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDockerComposeRunOption withOptions(String... elements) {
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableDockerComposeRunOption(this, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link DockerComposeRunOption#options() options}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of options elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDockerComposeRunOption withOptions(Iterable<String> elements) {
    if (this.options == elements) return this;
    ImmutableList<String> newValue = ImmutableList.copyOf(elements);
    return new ImmutableDockerComposeRunOption(this, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDockerComposeRunOption} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDockerComposeRunOption
        && equalTo((ImmutableDockerComposeRunOption) another);
  }

  private boolean equalTo(ImmutableDockerComposeRunOption another) {
    return options.equals(another.options);
  }

  /**
   * Computes a hash code from attributes: {@code options}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + options.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code DockerComposeRunOption...} with all non-generated
   * and non-auxiliary attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("DockerComposeRunOption")
        .add("options", options)
        .toString();
  }

  /**
   * Construct a new immutable {@code DockerComposeRunOption} instance.
   * @param options The value for the {@code options} attribute
   * @return An immutable DockerComposeRunOption instance
   */
  public static ImmutableDockerComposeRunOption of(List<String> options) {
    return of((Iterable<String>) options);
  }

  /**
   * Construct a new immutable {@code DockerComposeRunOption} instance.
   * @param options The value for the {@code options} attribute
   * @return An immutable DockerComposeRunOption instance
   */
  public static ImmutableDockerComposeRunOption of(Iterable<String> options) {
    return new ImmutableDockerComposeRunOption(options);
  }

  /**
   * Creates an immutable copy of a {@link DockerComposeRunOption} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DockerComposeRunOption instance
   */
  public static ImmutableDockerComposeRunOption copyOf(DockerComposeRunOption instance) {
    if (instance instanceof ImmutableDockerComposeRunOption) {
      return (ImmutableDockerComposeRunOption) instance;
    }
    return ImmutableDockerComposeRunOption.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableDockerComposeRunOption ImmutableDockerComposeRunOption}.
   * @return A new ImmutableDockerComposeRunOption builder
   */
  public static ImmutableDockerComposeRunOption.Builder builder() {
    return new ImmutableDockerComposeRunOption.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableDockerComposeRunOption ImmutableDockerComposeRunOption}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private ImmutableList.Builder<String> optionsBuilder = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code DockerComposeRunOption} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DockerComposeRunOption instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllOptions(instance.options());
      return this;
    }

    /**
     * Adds one element to {@link DockerComposeRunOption#options() options} list.
     * @param element A options element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addOptions(String element) {
      optionsBuilder.add(element);
      return this;
    }

    /**
     * Adds elements to {@link DockerComposeRunOption#options() options} list.
     * @param elements An array of options elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addOptions(String... elements) {
      optionsBuilder.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link DockerComposeRunOption#options() options} list.
     * @param elements An iterable of options elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder options(Iterable<String> elements) {
      optionsBuilder = ImmutableList.builder();
      return addAllOptions(elements);
    }

    /**
     * Adds elements to {@link DockerComposeRunOption#options() options} list.
     * @param elements An iterable of options elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllOptions(Iterable<String> elements) {
      optionsBuilder.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableDockerComposeRunOption ImmutableDockerComposeRunOption}.
     * @return An immutable instance of DockerComposeRunOption
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableDockerComposeRunOption build() {
      return new ImmutableDockerComposeRunOption(null, optionsBuilder.build());
    }
  }
}

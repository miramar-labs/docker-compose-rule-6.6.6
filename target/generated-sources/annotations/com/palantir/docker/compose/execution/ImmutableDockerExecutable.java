package com.palantir.docker.compose.execution;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link DockerExecutable}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDockerExecutable.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableDockerExecutable.of()}.
 */
@SuppressWarnings("all")
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "DockerExecutable"})
@Immutable
public final class ImmutableDockerExecutable extends DockerExecutable {
  private final DockerConfiguration dockerConfiguration;
  private final String dockerPath;

  private ImmutableDockerExecutable(DockerConfiguration dockerConfiguration) {
    this.dockerConfiguration = Preconditions.checkNotNull(dockerConfiguration, "dockerConfiguration");
    this.dockerPath = Preconditions.checkNotNull(super.dockerPath(), "dockerPath");
  }

  private ImmutableDockerExecutable(
      ImmutableDockerExecutable original,
      DockerConfiguration dockerConfiguration) {
    this.dockerConfiguration = dockerConfiguration;
    this.dockerPath = Preconditions.checkNotNull(super.dockerPath(), "dockerPath");
  }

  /**
   * @return The value of the {@code dockerConfiguration} attribute
   */
  @Override
  protected DockerConfiguration dockerConfiguration() {
    return dockerConfiguration;
  }

  /**
   * @return The computed-at-construction value of the {@code dockerPath} attribute
   */
  @Override
  protected String dockerPath() {
    return dockerPath;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DockerExecutable#dockerConfiguration() dockerConfiguration} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dockerConfiguration
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDockerExecutable withDockerConfiguration(DockerConfiguration value) {
    if (this.dockerConfiguration == value) return this;
    return new ImmutableDockerExecutable(this, Preconditions.checkNotNull(value, "dockerConfiguration"));
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDockerExecutable} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDockerExecutable
        && equalTo((ImmutableDockerExecutable) another);
  }

  private boolean equalTo(ImmutableDockerExecutable another) {
    return dockerConfiguration.equals(another.dockerConfiguration)
        && dockerPath.equals(another.dockerPath);
  }

  /**
   * Computes a hash code from attributes: {@code dockerConfiguration}, {@code dockerPath}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + dockerConfiguration.hashCode();
    h = h * 17 + dockerPath.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code DockerExecutable...} with all non-generated
   * and non-auxiliary attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("DockerExecutable")
        .add("dockerConfiguration", dockerConfiguration)
        .add("dockerPath", dockerPath)
        .toString();
  }

  /**
   * Construct a new immutable {@code DockerExecutable} instance.
   * @param dockerConfiguration The value for the {@code dockerConfiguration} attribute
   * @return An immutable DockerExecutable instance
   */
  public static ImmutableDockerExecutable of(DockerConfiguration dockerConfiguration) {
    return new ImmutableDockerExecutable(dockerConfiguration);
  }

  /**
   * Creates an immutable copy of a {@link DockerExecutable} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DockerExecutable instance
   */
  public static ImmutableDockerExecutable copyOf(DockerExecutable instance) {
    if (instance instanceof ImmutableDockerExecutable) {
      return (ImmutableDockerExecutable) instance;
    }
    return ImmutableDockerExecutable.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableDockerExecutable ImmutableDockerExecutable}.
   * @return A new ImmutableDockerExecutable builder
   */
  public static ImmutableDockerExecutable.Builder builder() {
    return new ImmutableDockerExecutable.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableDockerExecutable ImmutableDockerExecutable}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_DOCKER_CONFIGURATION = 0x1L;
    private long initBits = 0x1;

    private @Nullable DockerConfiguration dockerConfiguration;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code DockerExecutable} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DockerExecutable instance) {
      Preconditions.checkNotNull(instance, "instance");
      dockerConfiguration(instance.dockerConfiguration());
      return this;
    }

    /**
     * Initializes the value for the {@link DockerExecutable#dockerConfiguration() dockerConfiguration} attribute.
     * @param dockerConfiguration The value for dockerConfiguration 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder dockerConfiguration(DockerConfiguration dockerConfiguration) {
      this.dockerConfiguration = Preconditions.checkNotNull(dockerConfiguration, "dockerConfiguration");
      initBits &= ~INIT_BIT_DOCKER_CONFIGURATION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableDockerExecutable ImmutableDockerExecutable}.
     * @return An immutable instance of DockerExecutable
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableDockerExecutable build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableDockerExecutable(null, dockerConfiguration);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_DOCKER_CONFIGURATION) != 0) attributes.add("dockerConfiguration");
      return "Cannot build DockerExecutable, some of required attributes are not set " + attributes;
    }
  }
}

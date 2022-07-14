package com.palantir.docker.compose.connection;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link ContainerName}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableContainerName.builder()}.
 */
@SuppressWarnings("all")
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ContainerName"})
@Immutable
public final class ImmutableContainerName extends ContainerName {
  private final String rawName;
  private final String semanticName;

  private ImmutableContainerName(String rawName, String semanticName) {
    this.rawName = rawName;
    this.semanticName = semanticName;
  }

  /**
   * @return The value of the {@code rawName} attribute
   */
  @Override
  public String rawName() {
    return rawName;
  }

  /**
   * @return The value of the {@code semanticName} attribute
   */
  @Override
  public String semanticName() {
    return semanticName;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ContainerName#rawName() rawName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for rawName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableContainerName withRawName(String value) {
    if (this.rawName.equals(value)) return this;
    return new ImmutableContainerName(Preconditions.checkNotNull(value, "rawName"), this.semanticName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ContainerName#semanticName() semanticName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for semanticName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableContainerName withSemanticName(String value) {
    if (this.semanticName.equals(value)) return this;
    return new ImmutableContainerName(this.rawName, Preconditions.checkNotNull(value, "semanticName"));
  }

  /**
   * This instance is equal to all instances of {@code ImmutableContainerName} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableContainerName
        && equalTo((ImmutableContainerName) another);
  }

  private boolean equalTo(ImmutableContainerName another) {
    return rawName.equals(another.rawName)
        && semanticName.equals(another.semanticName);
  }

  /**
   * Computes a hash code from attributes: {@code rawName}, {@code semanticName}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + rawName.hashCode();
    h = h * 17 + semanticName.hashCode();
    return h;
  }

  /**
   * Creates an immutable copy of a {@link ContainerName} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ContainerName instance
   */
  public static ImmutableContainerName copyOf(ContainerName instance) {
    if (instance instanceof ImmutableContainerName) {
      return (ImmutableContainerName) instance;
    }
    return ImmutableContainerName.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableContainerName ImmutableContainerName}.
   * @return A new ImmutableContainerName builder
   */
  public static ImmutableContainerName.Builder builder() {
    return new ImmutableContainerName.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableContainerName ImmutableContainerName}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_RAW_NAME = 0x1L;
    private static final long INIT_BIT_SEMANTIC_NAME = 0x2L;
    private long initBits = 0x3;

    private @Nullable String rawName;
    private @Nullable String semanticName;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ContainerName} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ContainerName instance) {
      Preconditions.checkNotNull(instance, "instance");
      rawName(instance.rawName());
      semanticName(instance.semanticName());
      return this;
    }

    /**
     * Initializes the value for the {@link ContainerName#rawName() rawName} attribute.
     * @param rawName The value for rawName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder rawName(String rawName) {
      this.rawName = Preconditions.checkNotNull(rawName, "rawName");
      initBits &= ~INIT_BIT_RAW_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link ContainerName#semanticName() semanticName} attribute.
     * @param semanticName The value for semanticName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder semanticName(String semanticName) {
      this.semanticName = Preconditions.checkNotNull(semanticName, "semanticName");
      initBits &= ~INIT_BIT_SEMANTIC_NAME;
      return this;
    }

    /**
     * Builds a new {@link ImmutableContainerName ImmutableContainerName}.
     * @return An immutable instance of ContainerName
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableContainerName build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableContainerName(rawName, semanticName);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_RAW_NAME) != 0) attributes.add("rawName");
      if ((initBits & INIT_BIT_SEMANTIC_NAME) != 0) attributes.add("semanticName");
      return "Cannot build ContainerName, some of required attributes are not set " + attributes;
    }
  }
}

package com.palantir.docker.compose.connection.waiting;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link SuccessOrFailure}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSuccessOrFailure.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableSuccessOrFailure.of()}.
 */
@SuppressWarnings("all")
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "SuccessOrFailure"})
@Immutable
public final class ImmutableSuccessOrFailure
    extends SuccessOrFailure {
  private final @Nullable String optionalFailureMessage;

  private ImmutableSuccessOrFailure(Optional<String> optionalFailureMessage) {
    this.optionalFailureMessage = optionalFailureMessage.orElse(null);
  }

  private ImmutableSuccessOrFailure(
      ImmutableSuccessOrFailure original,
      @Nullable String optionalFailureMessage) {
    this.optionalFailureMessage = optionalFailureMessage;
  }

  /**
   * @return The value of the {@code optionalFailureMessage} attribute
   */
  @Override
  protected Optional<String> optionalFailureMessage() {
    return Optional.ofNullable(optionalFailureMessage);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SuccessOrFailure#optionalFailureMessage() optionalFailureMessage} attribute.
   * @param value The value for optionalFailureMessage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSuccessOrFailure withOptionalFailureMessage(String value) {
    @Nullable String newValue = Preconditions.checkNotNull(value, "optionalFailureMessage");
    if (Objects.equals(this.optionalFailureMessage, newValue)) return this;
    return new ImmutableSuccessOrFailure(this, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SuccessOrFailure#optionalFailureMessage() optionalFailureMessage} attribute.
   * @param optional A value for optionalFailureMessage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSuccessOrFailure withOptionalFailureMessage(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.optionalFailureMessage, value)) return this;
    return new ImmutableSuccessOrFailure(this, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSuccessOrFailure} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSuccessOrFailure
        && equalTo((ImmutableSuccessOrFailure) another);
  }

  private boolean equalTo(ImmutableSuccessOrFailure another) {
    return com.google.common.base.Objects.equal(optionalFailureMessage, another.optionalFailureMessage);
  }

  /**
   * Computes a hash code from attributes: {@code optionalFailureMessage}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + com.google.common.base.Objects.hashCode(optionalFailureMessage);
    return h;
  }

  /**
   * Prints the immutable value {@code SuccessOrFailure...} with all non-generated
   * and non-auxiliary attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("SuccessOrFailure")
        .add("optionalFailureMessage", optionalFailureMessage())
        .toString();
  }

  /**
   * Construct a new immutable {@code SuccessOrFailure} instance.
   * @param optionalFailureMessage The value for the {@code optionalFailureMessage} attribute
   * @return An immutable SuccessOrFailure instance
   */
  public static ImmutableSuccessOrFailure of(Optional<String> optionalFailureMessage) {
    return new ImmutableSuccessOrFailure(optionalFailureMessage);
  }

  /**
   * Creates an immutable copy of a {@link SuccessOrFailure} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SuccessOrFailure instance
   */
  public static ImmutableSuccessOrFailure copyOf(SuccessOrFailure instance) {
    if (instance instanceof ImmutableSuccessOrFailure) {
      return (ImmutableSuccessOrFailure) instance;
    }
    return ImmutableSuccessOrFailure.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSuccessOrFailure ImmutableSuccessOrFailure}.
   * @return A new ImmutableSuccessOrFailure builder
   */
  public static ImmutableSuccessOrFailure.Builder builder() {
    return new ImmutableSuccessOrFailure.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSuccessOrFailure ImmutableSuccessOrFailure}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private @Nullable String optionalFailureMessage;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SuccessOrFailure} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SuccessOrFailure instance) {
      Preconditions.checkNotNull(instance, "instance");
      Optional<String> optionalFailureMessageOptional = instance.optionalFailureMessage();
      if (optionalFailureMessageOptional.isPresent()) {
        optionalFailureMessage(optionalFailureMessageOptional);
      }
      return this;
    }

    /**
     * Initializes the optional value {@link SuccessOrFailure#optionalFailureMessage() optionalFailureMessage} to optionalFailureMessage.
     * @param optionalFailureMessage The value for optionalFailureMessage
     * @return {@code this} builder for chained invocation
     */
    public final Builder optionalFailureMessage(String optionalFailureMessage) {
      this.optionalFailureMessage = Preconditions.checkNotNull(optionalFailureMessage, "optionalFailureMessage");
      return this;
    }

    /**
     * Initializes the optional value {@link SuccessOrFailure#optionalFailureMessage() optionalFailureMessage} to optionalFailureMessage.
     * @param optionalFailureMessage The value for optionalFailureMessage
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder optionalFailureMessage(Optional<String> optionalFailureMessage) {
      this.optionalFailureMessage = optionalFailureMessage.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableSuccessOrFailure ImmutableSuccessOrFailure}.
     * @return An immutable instance of SuccessOrFailure
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSuccessOrFailure build() {
      return new ImmutableSuccessOrFailure(null, optionalFailureMessage);
    }
  }
}

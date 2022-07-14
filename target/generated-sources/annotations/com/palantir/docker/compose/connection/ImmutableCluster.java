package com.palantir.docker.compose.connection;

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
 * Immutable implementation of {@link Cluster}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCluster.builder()}.
 */
@SuppressWarnings("all")
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "Cluster"})
@Immutable
public final class ImmutableCluster extends Cluster {
  private final String ip;
  private final ContainerCache containerCache;

  private ImmutableCluster(String ip, ContainerCache containerCache) {
    this.ip = ip;
    this.containerCache = containerCache;
  }

  /**
   * @return The value of the {@code ip} attribute
   */
  @Override
  public String ip() {
    return ip;
  }

  /**
   * @return The value of the {@code containerCache} attribute
   */
  @Override
  public ContainerCache containerCache() {
    return containerCache;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Cluster#ip() ip} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ip
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCluster withIp(String value) {
    if (this.ip.equals(value)) return this;
    return new ImmutableCluster(Preconditions.checkNotNull(value, "ip"), this.containerCache);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Cluster#containerCache() containerCache} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for containerCache
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCluster withContainerCache(ContainerCache value) {
    if (this.containerCache == value) return this;
    return new ImmutableCluster(this.ip, Preconditions.checkNotNull(value, "containerCache"));
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCluster} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCluster
        && equalTo((ImmutableCluster) another);
  }

  private boolean equalTo(ImmutableCluster another) {
    return ip.equals(another.ip)
        && containerCache.equals(another.containerCache);
  }

  /**
   * Computes a hash code from attributes: {@code ip}, {@code containerCache}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + ip.hashCode();
    h = h * 17 + containerCache.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Cluster...} with all non-generated
   * and non-auxiliary attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Cluster")
        .add("ip", ip)
        .add("containerCache", containerCache)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link Cluster} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Cluster instance
   */
  public static ImmutableCluster copyOf(Cluster instance) {
    if (instance instanceof ImmutableCluster) {
      return (ImmutableCluster) instance;
    }
    return ImmutableCluster.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCluster ImmutableCluster}.
   * @return A new ImmutableCluster builder
   */
  public static ImmutableCluster.Builder builder() {
    return new ImmutableCluster.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCluster ImmutableCluster}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_IP = 0x1L;
    private static final long INIT_BIT_CONTAINER_CACHE = 0x2L;
    private long initBits = 0x3;

    private @Nullable String ip;
    private @Nullable ContainerCache containerCache;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Cluster} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Cluster instance) {
      Preconditions.checkNotNull(instance, "instance");
      ip(instance.ip());
      containerCache(instance.containerCache());
      return this;
    }

    /**
     * Initializes the value for the {@link Cluster#ip() ip} attribute.
     * @param ip The value for ip 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder ip(String ip) {
      this.ip = Preconditions.checkNotNull(ip, "ip");
      initBits &= ~INIT_BIT_IP;
      return this;
    }

    /**
     * Initializes the value for the {@link Cluster#containerCache() containerCache} attribute.
     * @param containerCache The value for containerCache 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder containerCache(ContainerCache containerCache) {
      this.containerCache = Preconditions.checkNotNull(containerCache, "containerCache");
      initBits &= ~INIT_BIT_CONTAINER_CACHE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableCluster ImmutableCluster}.
     * @return An immutable instance of Cluster
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCluster build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCluster(ip, containerCache);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_IP) != 0) attributes.add("ip");
      if ((initBits & INIT_BIT_CONTAINER_CACHE) != 0) attributes.add("containerCache");
      return "Cannot build Cluster, some of required attributes are not set " + attributes;
    }
  }
}

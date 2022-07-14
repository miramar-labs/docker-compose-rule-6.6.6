package com.palantir.docker.compose;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.primitives.Booleans;
import com.palantir.docker.compose.configuration.DockerComposeFiles;
import com.palantir.docker.compose.configuration.ProjectName;
import com.palantir.docker.compose.configuration.ShutdownStrategy;
import com.palantir.docker.compose.connection.Cluster;
import com.palantir.docker.compose.connection.DockerMachine;
import com.palantir.docker.compose.connection.waiting.ClusterWait;
import com.palantir.docker.compose.execution.Docker;
import com.palantir.docker.compose.execution.DockerCompose;
import com.palantir.docker.compose.execution.DockerComposeExecutable;
import com.palantir.docker.compose.execution.DockerExecutable;
import com.palantir.docker.compose.logging.LogCollector;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link DockerComposeRule}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code new DockerComposeRule.Builder()}.
 */
@SuppressWarnings("all")
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "DockerComposeRule"})
@Immutable
public final class ImmutableDockerComposeRule extends DockerComposeRule {
  private final DockerComposeFiles files;
  private final ImmutableList<ClusterWait> clusterWaits;
  private final DockerMachine machine;
  private final ProjectName projectName;
  private final DockerComposeExecutable dockerComposeExecutable;
  private final DockerExecutable dockerExecutable;
  private final Docker docker;
  private final ShutdownStrategy shutdownStrategy;
  private final DockerCompose dockerCompose;
  private final Cluster containers;
  private final int retryAttempts;
  private final boolean removeConflictingContainersOnStartup;
  private final LogCollector logCollector;

  private ImmutableDockerComposeRule(ImmutableDockerComposeRule.Builder builder) {
    this.files = builder.files;
    this.clusterWaits = builder.clusterWaitsBuilder.build();
    if (builder.machine != null) {
      initShim.machine(builder.machine);
    }
    if (builder.projectName != null) {
      initShim.projectName(builder.projectName);
    }
    if (builder.dockerComposeExecutable != null) {
      initShim.dockerComposeExecutable(builder.dockerComposeExecutable);
    }
    if (builder.dockerExecutable != null) {
      initShim.dockerExecutable(builder.dockerExecutable);
    }
    if (builder.docker != null) {
      initShim.docker(builder.docker);
    }
    if (builder.shutdownStrategy != null) {
      initShim.shutdownStrategy(builder.shutdownStrategy);
    }
    if (builder.dockerCompose != null) {
      initShim.dockerCompose(builder.dockerCompose);
    }
    if (builder.containers != null) {
      initShim.containers(builder.containers);
    }
    if (builder.retryAttemptsIsSet()) {
      initShim.retryAttempts(builder.retryAttempts);
    }
    if (builder.removeConflictingContainersOnStartupIsSet()) {
      initShim.removeConflictingContainersOnStartup(builder.removeConflictingContainersOnStartup);
    }
    if (builder.logCollector != null) {
      initShim.logCollector(builder.logCollector);
    }
    this.machine = initShim.machine();
    this.projectName = initShim.projectName();
    this.dockerComposeExecutable = initShim.dockerComposeExecutable();
    this.dockerExecutable = initShim.dockerExecutable();
    this.docker = initShim.docker();
    this.shutdownStrategy = initShim.shutdownStrategy();
    this.dockerCompose = initShim.dockerCompose();
    this.containers = initShim.containers();
    this.retryAttempts = initShim.retryAttempts();
    this.removeConflictingContainersOnStartup = initShim.removeConflictingContainersOnStartup();
    this.logCollector = initShim.logCollector();
    this.initShim = null;
  }

  private ImmutableDockerComposeRule(
      DockerComposeFiles files,
      ImmutableList<ClusterWait> clusterWaits,
      DockerMachine machine,
      ProjectName projectName,
      DockerComposeExecutable dockerComposeExecutable,
      DockerExecutable dockerExecutable,
      Docker docker,
      ShutdownStrategy shutdownStrategy,
      DockerCompose dockerCompose,
      Cluster containers,
      int retryAttempts,
      boolean removeConflictingContainersOnStartup,
      LogCollector logCollector) {
    this.files = files;
    this.clusterWaits = clusterWaits;
    this.machine = machine;
    this.projectName = projectName;
    this.dockerComposeExecutable = dockerComposeExecutable;
    this.dockerExecutable = dockerExecutable;
    this.docker = docker;
    this.shutdownStrategy = shutdownStrategy;
    this.dockerCompose = dockerCompose;
    this.containers = containers;
    this.retryAttempts = retryAttempts;
    this.removeConflictingContainersOnStartup = removeConflictingContainersOnStartup;
    this.logCollector = logCollector;
    initShim.machine(machine);
    initShim.projectName(projectName);
    initShim.dockerComposeExecutable(dockerComposeExecutable);
    initShim.dockerExecutable(dockerExecutable);
    initShim.docker(docker);
    initShim.shutdownStrategy(shutdownStrategy);
    initShim.dockerCompose(dockerCompose);
    initShim.containers(containers);
    initShim.retryAttempts(retryAttempts);
    initShim.removeConflictingContainersOnStartup(removeConflictingContainersOnStartup);
    initShim.logCollector(logCollector);
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private DockerMachine machine;
    private byte machineStage;

    DockerMachine machine() {
      if (machineStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (machineStage == STAGE_UNINITIALIZED) {
        machineStage = STAGE_INITIALIZING;
        this.machine = Preconditions.checkNotNull(ImmutableDockerComposeRule.super.machine(), "machine");
        machineStage = STAGE_INITIALIZED;
      }
      return machine;
    }

    DockerMachine machine(DockerMachine value) {
      this.machine = value;
      machineStage = STAGE_INITIALIZED;
      return value;
    }
    private ProjectName projectName;
    private byte projectNameStage;

    ProjectName projectName() {
      if (projectNameStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (projectNameStage == STAGE_UNINITIALIZED) {
        projectNameStage = STAGE_INITIALIZING;
        this.projectName = Preconditions.checkNotNull(ImmutableDockerComposeRule.super.projectName(), "projectName");
        projectNameStage = STAGE_INITIALIZED;
      }
      return projectName;
    }

    ProjectName projectName(ProjectName value) {
      this.projectName = value;
      projectNameStage = STAGE_INITIALIZED;
      return value;
    }
    private DockerComposeExecutable dockerComposeExecutable;
    private byte dockerComposeExecutableStage;

    DockerComposeExecutable dockerComposeExecutable() {
      if (dockerComposeExecutableStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (dockerComposeExecutableStage == STAGE_UNINITIALIZED) {
        dockerComposeExecutableStage = STAGE_INITIALIZING;
        this.dockerComposeExecutable = Preconditions.checkNotNull(ImmutableDockerComposeRule.super.dockerComposeExecutable(), "dockerComposeExecutable");
        dockerComposeExecutableStage = STAGE_INITIALIZED;
      }
      return dockerComposeExecutable;
    }

    DockerComposeExecutable dockerComposeExecutable(DockerComposeExecutable value) {
      this.dockerComposeExecutable = value;
      dockerComposeExecutableStage = STAGE_INITIALIZED;
      return value;
    }
    private DockerExecutable dockerExecutable;
    private byte dockerExecutableStage;

    DockerExecutable dockerExecutable() {
      if (dockerExecutableStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (dockerExecutableStage == STAGE_UNINITIALIZED) {
        dockerExecutableStage = STAGE_INITIALIZING;
        this.dockerExecutable = Preconditions.checkNotNull(ImmutableDockerComposeRule.super.dockerExecutable(), "dockerExecutable");
        dockerExecutableStage = STAGE_INITIALIZED;
      }
      return dockerExecutable;
    }

    DockerExecutable dockerExecutable(DockerExecutable value) {
      this.dockerExecutable = value;
      dockerExecutableStage = STAGE_INITIALIZED;
      return value;
    }
    private Docker docker;
    private byte dockerStage;

    Docker docker() {
      if (dockerStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (dockerStage == STAGE_UNINITIALIZED) {
        dockerStage = STAGE_INITIALIZING;
        this.docker = Preconditions.checkNotNull(ImmutableDockerComposeRule.super.docker(), "docker");
        dockerStage = STAGE_INITIALIZED;
      }
      return docker;
    }

    Docker docker(Docker value) {
      this.docker = value;
      dockerStage = STAGE_INITIALIZED;
      return value;
    }
    private ShutdownStrategy shutdownStrategy;
    private byte shutdownStrategyStage;

    ShutdownStrategy shutdownStrategy() {
      if (shutdownStrategyStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (shutdownStrategyStage == STAGE_UNINITIALIZED) {
        shutdownStrategyStage = STAGE_INITIALIZING;
        this.shutdownStrategy = Preconditions.checkNotNull(ImmutableDockerComposeRule.super.shutdownStrategy(), "shutdownStrategy");
        shutdownStrategyStage = STAGE_INITIALIZED;
      }
      return shutdownStrategy;
    }

    ShutdownStrategy shutdownStrategy(ShutdownStrategy value) {
      this.shutdownStrategy = value;
      shutdownStrategyStage = STAGE_INITIALIZED;
      return value;
    }
    private DockerCompose dockerCompose;
    private byte dockerComposeStage;

    DockerCompose dockerCompose() {
      if (dockerComposeStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (dockerComposeStage == STAGE_UNINITIALIZED) {
        dockerComposeStage = STAGE_INITIALIZING;
        this.dockerCompose = Preconditions.checkNotNull(ImmutableDockerComposeRule.super.dockerCompose(), "dockerCompose");
        dockerComposeStage = STAGE_INITIALIZED;
      }
      return dockerCompose;
    }

    DockerCompose dockerCompose(DockerCompose value) {
      this.dockerCompose = value;
      dockerComposeStage = STAGE_INITIALIZED;
      return value;
    }
    private Cluster containers;
    private byte containersStage;

    Cluster containers() {
      if (containersStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (containersStage == STAGE_UNINITIALIZED) {
        containersStage = STAGE_INITIALIZING;
        this.containers = Preconditions.checkNotNull(ImmutableDockerComposeRule.super.containers(), "containers");
        containersStage = STAGE_INITIALIZED;
      }
      return containers;
    }

    Cluster containers(Cluster value) {
      this.containers = value;
      containersStage = STAGE_INITIALIZED;
      return value;
    }
    private int retryAttempts;
    private byte retryAttemptsStage;

    int retryAttempts() {
      if (retryAttemptsStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (retryAttemptsStage == STAGE_UNINITIALIZED) {
        retryAttemptsStage = STAGE_INITIALIZING;
        this.retryAttempts = ImmutableDockerComposeRule.super.retryAttempts();
        retryAttemptsStage = STAGE_INITIALIZED;
      }
      return retryAttempts;
    }

    int retryAttempts(int value) {
      this.retryAttempts = value;
      retryAttemptsStage = STAGE_INITIALIZED;
      return value;
    }
    private boolean removeConflictingContainersOnStartup;
    private byte removeConflictingContainersOnStartupStage;

    boolean removeConflictingContainersOnStartup() {
      if (removeConflictingContainersOnStartupStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (removeConflictingContainersOnStartupStage == STAGE_UNINITIALIZED) {
        removeConflictingContainersOnStartupStage = STAGE_INITIALIZING;
        this.removeConflictingContainersOnStartup = ImmutableDockerComposeRule.super.removeConflictingContainersOnStartup();
        removeConflictingContainersOnStartupStage = STAGE_INITIALIZED;
      }
      return removeConflictingContainersOnStartup;
    }

    boolean removeConflictingContainersOnStartup(boolean value) {
      this.removeConflictingContainersOnStartup = value;
      removeConflictingContainersOnStartupStage = STAGE_INITIALIZED;
      return value;
    }
    private LogCollector logCollector;
    private byte logCollectorStage;

    LogCollector logCollector() {
      if (logCollectorStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (logCollectorStage == STAGE_UNINITIALIZED) {
        logCollectorStage = STAGE_INITIALIZING;
        this.logCollector = Preconditions.checkNotNull(ImmutableDockerComposeRule.super.logCollector(), "logCollector");
        logCollectorStage = STAGE_INITIALIZED;
      }
      return logCollector;
    }

    LogCollector logCollector(LogCollector value) {
      this.logCollector = value;
      logCollectorStage = STAGE_INITIALIZED;
      return value;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = Lists.newArrayList();
      if (machineStage == STAGE_INITIALIZING) attributes.add("machine");
      if (projectNameStage == STAGE_INITIALIZING) attributes.add("projectName");
      if (dockerComposeExecutableStage == STAGE_INITIALIZING) attributes.add("dockerComposeExecutable");
      if (dockerExecutableStage == STAGE_INITIALIZING) attributes.add("dockerExecutable");
      if (dockerStage == STAGE_INITIALIZING) attributes.add("docker");
      if (shutdownStrategyStage == STAGE_INITIALIZING) attributes.add("shutdownStrategy");
      if (dockerComposeStage == STAGE_INITIALIZING) attributes.add("dockerCompose");
      if (containersStage == STAGE_INITIALIZING) attributes.add("containers");
      if (retryAttemptsStage == STAGE_INITIALIZING) attributes.add("retryAttempts");
      if (removeConflictingContainersOnStartupStage == STAGE_INITIALIZING) attributes.add("removeConflictingContainersOnStartup");
      if (logCollectorStage == STAGE_INITIALIZING) attributes.add("logCollector");
      return "Cannot build DockerComposeRule, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code files} attribute
   */
  @Override
  public DockerComposeFiles files() {
    return files;
  }

  /**
   * @return The value of the {@code clusterWaits} attribute
   */
  @Override
  protected ImmutableList<ClusterWait> clusterWaits() {
    return clusterWaits;
  }

  /**
   * @return The value of the {@code machine} attribute
   */
  @Override
  public DockerMachine machine() {
    return initShim != null
        ? initShim.machine()
        : machine;
  }

  /**
   * @return The value of the {@code projectName} attribute
   */
  @Override
  public ProjectName projectName() {
    return initShim != null
        ? initShim.projectName()
        : projectName;
  }

  /**
   * @return The value of the {@code dockerComposeExecutable} attribute
   */
  @Override
  public DockerComposeExecutable dockerComposeExecutable() {
    return initShim != null
        ? initShim.dockerComposeExecutable()
        : dockerComposeExecutable;
  }

  /**
   * @return The value of the {@code dockerExecutable} attribute
   */
  @Override
  public DockerExecutable dockerExecutable() {
    return initShim != null
        ? initShim.dockerExecutable()
        : dockerExecutable;
  }

  /**
   * @return The value of the {@code docker} attribute
   */
  @Override
  public Docker docker() {
    return initShim != null
        ? initShim.docker()
        : docker;
  }

  /**
   * @return The value of the {@code shutdownStrategy} attribute
   */
  @Override
  public ShutdownStrategy shutdownStrategy() {
    return initShim != null
        ? initShim.shutdownStrategy()
        : shutdownStrategy;
  }

  /**
   * @return The value of the {@code dockerCompose} attribute
   */
  @Override
  public DockerCompose dockerCompose() {
    return initShim != null
        ? initShim.dockerCompose()
        : dockerCompose;
  }

  /**
   * @return The value of the {@code containers} attribute
   */
  @Override
  public Cluster containers() {
    return initShim != null
        ? initShim.containers()
        : containers;
  }

  /**
   * @return The value of the {@code retryAttempts} attribute
   */
  @Override
  protected int retryAttempts() {
    return initShim != null
        ? initShim.retryAttempts()
        : retryAttempts;
  }

  /**
   * @return The value of the {@code removeConflictingContainersOnStartup} attribute
   */
  @Override
  protected boolean removeConflictingContainersOnStartup() {
    return initShim != null
        ? initShim.removeConflictingContainersOnStartup()
        : removeConflictingContainersOnStartup;
  }

  /**
   * @return The value of the {@code logCollector} attribute
   */
  @Override
  protected LogCollector logCollector() {
    return initShim != null
        ? initShim.logCollector()
        : logCollector;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DockerComposeRule#files() files} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for files
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDockerComposeRule withFiles(DockerComposeFiles value) {
    if (this.files == value) return this;
    return new ImmutableDockerComposeRule(
        Preconditions.checkNotNull(value, "files"),
        this.clusterWaits,
        this.machine,
        this.projectName,
        this.dockerComposeExecutable,
        this.dockerExecutable,
        this.docker,
        this.shutdownStrategy,
        this.dockerCompose,
        this.containers,
        this.retryAttempts,
        this.removeConflictingContainersOnStartup,
        this.logCollector);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link DockerComposeRule#clusterWaits() clusterWaits}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDockerComposeRule withClusterWaits(ClusterWait... elements) {
    ImmutableList<ClusterWait> newValue = ImmutableList.copyOf(elements);
    return new ImmutableDockerComposeRule(
        this.files,
        newValue,
        this.machine,
        this.projectName,
        this.dockerComposeExecutable,
        this.dockerExecutable,
        this.docker,
        this.shutdownStrategy,
        this.dockerCompose,
        this.containers,
        this.retryAttempts,
        this.removeConflictingContainersOnStartup,
        this.logCollector);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link DockerComposeRule#clusterWaits() clusterWaits}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of clusterWaits elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDockerComposeRule withClusterWaits(Iterable<? extends ClusterWait> elements) {
    if (this.clusterWaits == elements) return this;
    ImmutableList<ClusterWait> newValue = ImmutableList.copyOf(elements);
    return new ImmutableDockerComposeRule(
        this.files,
        newValue,
        this.machine,
        this.projectName,
        this.dockerComposeExecutable,
        this.dockerExecutable,
        this.docker,
        this.shutdownStrategy,
        this.dockerCompose,
        this.containers,
        this.retryAttempts,
        this.removeConflictingContainersOnStartup,
        this.logCollector);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DockerComposeRule#machine() machine} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for machine
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDockerComposeRule withMachine(DockerMachine value) {
    if (this.machine == value) return this;
    return new ImmutableDockerComposeRule(
        this.files,
        this.clusterWaits,
        Preconditions.checkNotNull(value, "machine"),
        this.projectName,
        this.dockerComposeExecutable,
        this.dockerExecutable,
        this.docker,
        this.shutdownStrategy,
        this.dockerCompose,
        this.containers,
        this.retryAttempts,
        this.removeConflictingContainersOnStartup,
        this.logCollector);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DockerComposeRule#projectName() projectName} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for projectName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDockerComposeRule withProjectName(ProjectName value) {
    if (this.projectName == value) return this;
    return new ImmutableDockerComposeRule(
        this.files,
        this.clusterWaits,
        this.machine,
        Preconditions.checkNotNull(value, "projectName"),
        this.dockerComposeExecutable,
        this.dockerExecutable,
        this.docker,
        this.shutdownStrategy,
        this.dockerCompose,
        this.containers,
        this.retryAttempts,
        this.removeConflictingContainersOnStartup,
        this.logCollector);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DockerComposeRule#dockerComposeExecutable() dockerComposeExecutable} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dockerComposeExecutable
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDockerComposeRule withDockerComposeExecutable(DockerComposeExecutable value) {
    if (this.dockerComposeExecutable == value) return this;
    return new ImmutableDockerComposeRule(
        this.files,
        this.clusterWaits,
        this.machine,
        this.projectName,
        Preconditions.checkNotNull(value, "dockerComposeExecutable"),
        this.dockerExecutable,
        this.docker,
        this.shutdownStrategy,
        this.dockerCompose,
        this.containers,
        this.retryAttempts,
        this.removeConflictingContainersOnStartup,
        this.logCollector);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DockerComposeRule#dockerExecutable() dockerExecutable} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dockerExecutable
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDockerComposeRule withDockerExecutable(DockerExecutable value) {
    if (this.dockerExecutable == value) return this;
    return new ImmutableDockerComposeRule(
        this.files,
        this.clusterWaits,
        this.machine,
        this.projectName,
        this.dockerComposeExecutable,
        Preconditions.checkNotNull(value, "dockerExecutable"),
        this.docker,
        this.shutdownStrategy,
        this.dockerCompose,
        this.containers,
        this.retryAttempts,
        this.removeConflictingContainersOnStartup,
        this.logCollector);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DockerComposeRule#docker() docker} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for docker
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDockerComposeRule withDocker(Docker value) {
    if (this.docker == value) return this;
    return new ImmutableDockerComposeRule(
        this.files,
        this.clusterWaits,
        this.machine,
        this.projectName,
        this.dockerComposeExecutable,
        this.dockerExecutable,
        Preconditions.checkNotNull(value, "docker"),
        this.shutdownStrategy,
        this.dockerCompose,
        this.containers,
        this.retryAttempts,
        this.removeConflictingContainersOnStartup,
        this.logCollector);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DockerComposeRule#shutdownStrategy() shutdownStrategy} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for shutdownStrategy
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDockerComposeRule withShutdownStrategy(ShutdownStrategy value) {
    if (this.shutdownStrategy == value) return this;
    return new ImmutableDockerComposeRule(
        this.files,
        this.clusterWaits,
        this.machine,
        this.projectName,
        this.dockerComposeExecutable,
        this.dockerExecutable,
        this.docker,
        Preconditions.checkNotNull(value, "shutdownStrategy"),
        this.dockerCompose,
        this.containers,
        this.retryAttempts,
        this.removeConflictingContainersOnStartup,
        this.logCollector);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DockerComposeRule#dockerCompose() dockerCompose} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dockerCompose
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDockerComposeRule withDockerCompose(DockerCompose value) {
    if (this.dockerCompose == value) return this;
    return new ImmutableDockerComposeRule(
        this.files,
        this.clusterWaits,
        this.machine,
        this.projectName,
        this.dockerComposeExecutable,
        this.dockerExecutable,
        this.docker,
        this.shutdownStrategy,
        Preconditions.checkNotNull(value, "dockerCompose"),
        this.containers,
        this.retryAttempts,
        this.removeConflictingContainersOnStartup,
        this.logCollector);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DockerComposeRule#containers() containers} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for containers
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDockerComposeRule withContainers(Cluster value) {
    if (this.containers == value) return this;
    return new ImmutableDockerComposeRule(
        this.files,
        this.clusterWaits,
        this.machine,
        this.projectName,
        this.dockerComposeExecutable,
        this.dockerExecutable,
        this.docker,
        this.shutdownStrategy,
        this.dockerCompose,
        Preconditions.checkNotNull(value, "containers"),
        this.retryAttempts,
        this.removeConflictingContainersOnStartup,
        this.logCollector);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DockerComposeRule#retryAttempts() retryAttempts} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for retryAttempts
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDockerComposeRule withRetryAttempts(int value) {
    if (this.retryAttempts == value) return this;
    return new ImmutableDockerComposeRule(
        this.files,
        this.clusterWaits,
        this.machine,
        this.projectName,
        this.dockerComposeExecutable,
        this.dockerExecutable,
        this.docker,
        this.shutdownStrategy,
        this.dockerCompose,
        this.containers,
        value,
        this.removeConflictingContainersOnStartup,
        this.logCollector);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DockerComposeRule#removeConflictingContainersOnStartup() removeConflictingContainersOnStartup} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for removeConflictingContainersOnStartup
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDockerComposeRule withRemoveConflictingContainersOnStartup(boolean value) {
    if (this.removeConflictingContainersOnStartup == value) return this;
    return new ImmutableDockerComposeRule(
        this.files,
        this.clusterWaits,
        this.machine,
        this.projectName,
        this.dockerComposeExecutable,
        this.dockerExecutable,
        this.docker,
        this.shutdownStrategy,
        this.dockerCompose,
        this.containers,
        this.retryAttempts,
        value,
        this.logCollector);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DockerComposeRule#logCollector() logCollector} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for logCollector
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDockerComposeRule withLogCollector(LogCollector value) {
    if (this.logCollector == value) return this;
    return new ImmutableDockerComposeRule(
        this.files,
        this.clusterWaits,
        this.machine,
        this.projectName,
        this.dockerComposeExecutable,
        this.dockerExecutable,
        this.docker,
        this.shutdownStrategy,
        this.dockerCompose,
        this.containers,
        this.retryAttempts,
        this.removeConflictingContainersOnStartup,
        Preconditions.checkNotNull(value, "logCollector"));
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDockerComposeRule} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDockerComposeRule
        && equalTo((ImmutableDockerComposeRule) another);
  }

  private boolean equalTo(ImmutableDockerComposeRule another) {
    return files.equals(another.files)
        && clusterWaits.equals(another.clusterWaits)
        && machine.equals(another.machine)
        && projectName.equals(another.projectName)
        && dockerComposeExecutable.equals(another.dockerComposeExecutable)
        && dockerExecutable.equals(another.dockerExecutable)
        && docker.equals(another.docker)
        && shutdownStrategy.equals(another.shutdownStrategy)
        && dockerCompose.equals(another.dockerCompose)
        && containers.equals(another.containers)
        && retryAttempts == another.retryAttempts
        && removeConflictingContainersOnStartup == another.removeConflictingContainersOnStartup
        && logCollector.equals(another.logCollector);
  }

  /**
   * Computes a hash code from attributes: {@code files}, {@code clusterWaits}, {@code machine}, {@code projectName}, {@code dockerComposeExecutable}, {@code dockerExecutable}, {@code docker}, {@code shutdownStrategy}, {@code dockerCompose}, {@code containers}, {@code retryAttempts}, {@code removeConflictingContainersOnStartup}, {@code logCollector}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + files.hashCode();
    h = h * 17 + clusterWaits.hashCode();
    h = h * 17 + machine.hashCode();
    h = h * 17 + projectName.hashCode();
    h = h * 17 + dockerComposeExecutable.hashCode();
    h = h * 17 + dockerExecutable.hashCode();
    h = h * 17 + docker.hashCode();
    h = h * 17 + shutdownStrategy.hashCode();
    h = h * 17 + dockerCompose.hashCode();
    h = h * 17 + containers.hashCode();
    h = h * 17 + retryAttempts;
    h = h * 17 + Booleans.hashCode(removeConflictingContainersOnStartup);
    h = h * 17 + logCollector.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code DockerComposeRule...} with all non-generated
   * and non-auxiliary attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("DockerComposeRule")
        .add("files", files)
        .add("clusterWaits", clusterWaits)
        .add("machine", machine)
        .add("projectName", projectName)
        .add("dockerComposeExecutable", dockerComposeExecutable)
        .add("dockerExecutable", dockerExecutable)
        .add("docker", docker)
        .add("shutdownStrategy", shutdownStrategy)
        .add("dockerCompose", dockerCompose)
        .add("containers", containers)
        .add("retryAttempts", retryAttempts)
        .add("removeConflictingContainersOnStartup", removeConflictingContainersOnStartup)
        .add("logCollector", logCollector)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link DockerComposeRule} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DockerComposeRule instance
   */
  public static ImmutableDockerComposeRule copyOf(DockerComposeRule instance) {
    if (instance instanceof ImmutableDockerComposeRule) {
      return (ImmutableDockerComposeRule) instance;
    }
    return new DockerComposeRule.Builder()
        .files(instance.files())
        .addAllClusterWaits(instance.clusterWaits())
        .machine(instance.machine())
        .projectName(instance.projectName())
        .dockerComposeExecutable(instance.dockerComposeExecutable())
        .dockerExecutable(instance.dockerExecutable())
        .docker(instance.docker())
        .shutdownStrategy(instance.shutdownStrategy())
        .dockerCompose(instance.dockerCompose())
        .containers(instance.containers())
        .retryAttempts(instance.retryAttempts())
        .removeConflictingContainersOnStartup(instance.removeConflictingContainersOnStartup())
        .logCollector(instance.logCollector())
        .build();
  }

  /**
   * Builds instances of type {@link ImmutableDockerComposeRule ImmutableDockerComposeRule}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static class Builder {
    private static final long INIT_BIT_FILES = 0x1L;
    private static final long OPT_BIT_MACHINE = 0x1L;
    private static final long OPT_BIT_PROJECT_NAME = 0x2L;
    private static final long OPT_BIT_DOCKER_COMPOSE_EXECUTABLE = 0x4L;
    private static final long OPT_BIT_DOCKER_EXECUTABLE = 0x8L;
    private static final long OPT_BIT_DOCKER = 0x10L;
    private static final long OPT_BIT_SHUTDOWN_STRATEGY = 0x20L;
    private static final long OPT_BIT_DOCKER_COMPOSE = 0x40L;
    private static final long OPT_BIT_CONTAINERS = 0x80L;
    private static final long OPT_BIT_RETRY_ATTEMPTS = 0x100L;
    private static final long OPT_BIT_REMOVE_CONFLICTING_CONTAINERS_ON_STARTUP = 0x200L;
    private static final long OPT_BIT_LOG_COLLECTOR = 0x400L;
    private long initBits = 0x1;
    private long optBits;

    private @Nullable DockerComposeFiles files;
    private ImmutableList.Builder<ClusterWait> clusterWaitsBuilder = ImmutableList.builder();
    private @Nullable DockerMachine machine;
    private @Nullable ProjectName projectName;
    private @Nullable DockerComposeExecutable dockerComposeExecutable;
    private @Nullable DockerExecutable dockerExecutable;
    private @Nullable Docker docker;
    private @Nullable ShutdownStrategy shutdownStrategy;
    private @Nullable DockerCompose dockerCompose;
    private @Nullable Cluster containers;
    private int retryAttempts;
    private boolean removeConflictingContainersOnStartup;
    private @Nullable LogCollector logCollector;

    /**
     * Creates a builder for {@link ImmutableDockerComposeRule ImmutableDockerComposeRule} instances.
     */
    public Builder() {
      if (!(this instanceof DockerComposeRule.Builder)) {
        throw new UnsupportedOperationException("Use: new DockerComposeRule.Builder()");
      }
    }

    /**
     * Initializes the value for the {@link DockerComposeRule#files() files} attribute.
     * @param files The value for files 
     * @return {@code this} builder for use in a chained invocation
     */
    public final DockerComposeRule.Builder files(DockerComposeFiles files) {
      checkNotIsSet(filesIsSet(), "files");
      this.files = Preconditions.checkNotNull(files, "files");
      initBits &= ~INIT_BIT_FILES;
      return (DockerComposeRule.Builder) this;
    }

    /**
     * Adds one element to {@link DockerComposeRule#clusterWaits() clusterWaits} list.
     * @param element A clusterWaits element
     * @return {@code this} builder for use in a chained invocation
     */
    public final DockerComposeRule.Builder addClusterWait(ClusterWait element) {
      clusterWaitsBuilder.add(element);
      return (DockerComposeRule.Builder) this;
    }

    /**
     * Adds elements to {@link DockerComposeRule#clusterWaits() clusterWaits} list.
     * @param elements An array of clusterWaits elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final DockerComposeRule.Builder addClusterWait(ClusterWait... elements) {
      clusterWaitsBuilder.add(elements);
      return (DockerComposeRule.Builder) this;
    }

    /**
     * Adds elements to {@link DockerComposeRule#clusterWaits() clusterWaits} list.
     * @param elements An iterable of clusterWaits elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final DockerComposeRule.Builder addAllClusterWaits(Iterable<? extends ClusterWait> elements) {
      clusterWaitsBuilder.addAll(elements);
      return (DockerComposeRule.Builder) this;
    }

    /**
     * Initializes the value for the {@link DockerComposeRule#machine() machine} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link DockerComposeRule#machine() machine}.</em>
     * @param machine The value for machine 
     * @return {@code this} builder for use in a chained invocation
     */
    public final DockerComposeRule.Builder machine(DockerMachine machine) {
      checkNotIsSet(machineIsSet(), "machine");
      this.machine = Preconditions.checkNotNull(machine, "machine");
      optBits |= OPT_BIT_MACHINE;
      return (DockerComposeRule.Builder) this;
    }

    /**
     * Initializes the value for the {@link DockerComposeRule#projectName() projectName} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link DockerComposeRule#projectName() projectName}.</em>
     * @param projectName The value for projectName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final DockerComposeRule.Builder projectName(ProjectName projectName) {
      checkNotIsSet(projectNameIsSet(), "projectName");
      this.projectName = Preconditions.checkNotNull(projectName, "projectName");
      optBits |= OPT_BIT_PROJECT_NAME;
      return (DockerComposeRule.Builder) this;
    }

    /**
     * Initializes the value for the {@link DockerComposeRule#dockerComposeExecutable() dockerComposeExecutable} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link DockerComposeRule#dockerComposeExecutable() dockerComposeExecutable}.</em>
     * @param dockerComposeExecutable The value for dockerComposeExecutable 
     * @return {@code this} builder for use in a chained invocation
     */
    public final DockerComposeRule.Builder dockerComposeExecutable(DockerComposeExecutable dockerComposeExecutable) {
      checkNotIsSet(dockerComposeExecutableIsSet(), "dockerComposeExecutable");
      this.dockerComposeExecutable = Preconditions.checkNotNull(dockerComposeExecutable, "dockerComposeExecutable");
      optBits |= OPT_BIT_DOCKER_COMPOSE_EXECUTABLE;
      return (DockerComposeRule.Builder) this;
    }

    /**
     * Initializes the value for the {@link DockerComposeRule#dockerExecutable() dockerExecutable} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link DockerComposeRule#dockerExecutable() dockerExecutable}.</em>
     * @param dockerExecutable The value for dockerExecutable 
     * @return {@code this} builder for use in a chained invocation
     */
    public final DockerComposeRule.Builder dockerExecutable(DockerExecutable dockerExecutable) {
      checkNotIsSet(dockerExecutableIsSet(), "dockerExecutable");
      this.dockerExecutable = Preconditions.checkNotNull(dockerExecutable, "dockerExecutable");
      optBits |= OPT_BIT_DOCKER_EXECUTABLE;
      return (DockerComposeRule.Builder) this;
    }

    /**
     * Initializes the value for the {@link DockerComposeRule#docker() docker} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link DockerComposeRule#docker() docker}.</em>
     * @param docker The value for docker 
     * @return {@code this} builder for use in a chained invocation
     */
    public final DockerComposeRule.Builder docker(Docker docker) {
      checkNotIsSet(dockerIsSet(), "docker");
      this.docker = Preconditions.checkNotNull(docker, "docker");
      optBits |= OPT_BIT_DOCKER;
      return (DockerComposeRule.Builder) this;
    }

    /**
     * Initializes the value for the {@link DockerComposeRule#shutdownStrategy() shutdownStrategy} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link DockerComposeRule#shutdownStrategy() shutdownStrategy}.</em>
     * @param shutdownStrategy The value for shutdownStrategy 
     * @return {@code this} builder for use in a chained invocation
     */
    public final DockerComposeRule.Builder shutdownStrategy(ShutdownStrategy shutdownStrategy) {
      checkNotIsSet(shutdownStrategyIsSet(), "shutdownStrategy");
      this.shutdownStrategy = Preconditions.checkNotNull(shutdownStrategy, "shutdownStrategy");
      optBits |= OPT_BIT_SHUTDOWN_STRATEGY;
      return (DockerComposeRule.Builder) this;
    }

    /**
     * Initializes the value for the {@link DockerComposeRule#dockerCompose() dockerCompose} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link DockerComposeRule#dockerCompose() dockerCompose}.</em>
     * @param dockerCompose The value for dockerCompose 
     * @return {@code this} builder for use in a chained invocation
     */
    public final DockerComposeRule.Builder dockerCompose(DockerCompose dockerCompose) {
      checkNotIsSet(dockerComposeIsSet(), "dockerCompose");
      this.dockerCompose = Preconditions.checkNotNull(dockerCompose, "dockerCompose");
      optBits |= OPT_BIT_DOCKER_COMPOSE;
      return (DockerComposeRule.Builder) this;
    }

    /**
     * Initializes the value for the {@link DockerComposeRule#containers() containers} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link DockerComposeRule#containers() containers}.</em>
     * @param containers The value for containers 
     * @return {@code this} builder for use in a chained invocation
     */
    public final DockerComposeRule.Builder containers(Cluster containers) {
      checkNotIsSet(containersIsSet(), "containers");
      this.containers = Preconditions.checkNotNull(containers, "containers");
      optBits |= OPT_BIT_CONTAINERS;
      return (DockerComposeRule.Builder) this;
    }

    /**
     * Initializes the value for the {@link DockerComposeRule#retryAttempts() retryAttempts} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link DockerComposeRule#retryAttempts() retryAttempts}.</em>
     * @param retryAttempts The value for retryAttempts 
     * @return {@code this} builder for use in a chained invocation
     */
    public final DockerComposeRule.Builder retryAttempts(int retryAttempts) {
      checkNotIsSet(retryAttemptsIsSet(), "retryAttempts");
      this.retryAttempts = retryAttempts;
      optBits |= OPT_BIT_RETRY_ATTEMPTS;
      return (DockerComposeRule.Builder) this;
    }

    /**
     * Initializes the value for the {@link DockerComposeRule#removeConflictingContainersOnStartup() removeConflictingContainersOnStartup} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link DockerComposeRule#removeConflictingContainersOnStartup() removeConflictingContainersOnStartup}.</em>
     * @param removeConflictingContainersOnStartup The value for removeConflictingContainersOnStartup 
     * @return {@code this} builder for use in a chained invocation
     */
    public final DockerComposeRule.Builder removeConflictingContainersOnStartup(boolean removeConflictingContainersOnStartup) {
      checkNotIsSet(removeConflictingContainersOnStartupIsSet(), "removeConflictingContainersOnStartup");
      this.removeConflictingContainersOnStartup = removeConflictingContainersOnStartup;
      optBits |= OPT_BIT_REMOVE_CONFLICTING_CONTAINERS_ON_STARTUP;
      return (DockerComposeRule.Builder) this;
    }

    /**
     * Initializes the value for the {@link DockerComposeRule#logCollector() logCollector} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link DockerComposeRule#logCollector() logCollector}.</em>
     * @param logCollector The value for logCollector 
     * @return {@code this} builder for use in a chained invocation
     */
    public final DockerComposeRule.Builder logCollector(LogCollector logCollector) {
      checkNotIsSet(logCollectorIsSet(), "logCollector");
      this.logCollector = Preconditions.checkNotNull(logCollector, "logCollector");
      optBits |= OPT_BIT_LOG_COLLECTOR;
      return (DockerComposeRule.Builder) this;
    }

    /**
     * Builds a new {@link ImmutableDockerComposeRule ImmutableDockerComposeRule}.
     * @return An immutable instance of DockerComposeRule
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableDockerComposeRule build() {
      checkRequiredAttributes();
      return new ImmutableDockerComposeRule(this);
    }

    private boolean machineIsSet() {
      return (optBits & OPT_BIT_MACHINE) != 0;
    }

    private boolean projectNameIsSet() {
      return (optBits & OPT_BIT_PROJECT_NAME) != 0;
    }

    private boolean dockerComposeExecutableIsSet() {
      return (optBits & OPT_BIT_DOCKER_COMPOSE_EXECUTABLE) != 0;
    }

    private boolean dockerExecutableIsSet() {
      return (optBits & OPT_BIT_DOCKER_EXECUTABLE) != 0;
    }

    private boolean dockerIsSet() {
      return (optBits & OPT_BIT_DOCKER) != 0;
    }

    private boolean shutdownStrategyIsSet() {
      return (optBits & OPT_BIT_SHUTDOWN_STRATEGY) != 0;
    }

    private boolean dockerComposeIsSet() {
      return (optBits & OPT_BIT_DOCKER_COMPOSE) != 0;
    }

    private boolean containersIsSet() {
      return (optBits & OPT_BIT_CONTAINERS) != 0;
    }

    private boolean retryAttemptsIsSet() {
      return (optBits & OPT_BIT_RETRY_ATTEMPTS) != 0;
    }

    private boolean removeConflictingContainersOnStartupIsSet() {
      return (optBits & OPT_BIT_REMOVE_CONFLICTING_CONTAINERS_ON_STARTUP) != 0;
    }

    private boolean logCollectorIsSet() {
      return (optBits & OPT_BIT_LOG_COLLECTOR) != 0;
    }

    private boolean filesIsSet() {
      return (initBits & INIT_BIT_FILES) == 0;
    }

    private void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of DockerComposeRule is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() throws IllegalStateException {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if (!filesIsSet()) attributes.add("files");
      return "Cannot build DockerComposeRule, some of required attributes are not set " + attributes;
    }
  }
}

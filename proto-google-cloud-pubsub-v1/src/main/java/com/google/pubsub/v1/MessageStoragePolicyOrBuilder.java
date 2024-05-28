/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

// Protobuf Java Version: 3.25.2
package com.google.pubsub.v1;

public interface MessageStoragePolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.MessageStoragePolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. A list of IDs of Google Cloud regions where messages that are
   * published to the topic may be persisted in storage. Messages published by
   * publishers running in non-allowed Google Cloud regions (or running outside
   * of Google Cloud altogether) are routed for storage in one of the allowed
   * regions. An empty list means that no regions are allowed, and is not a
   * valid configuration.
   * </pre>
   *
   * <code>
   * repeated string allowed_persistence_regions = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the allowedPersistenceRegions.
   */
  java.util.List<java.lang.String> getAllowedPersistenceRegionsList();
  /**
   *
   *
   * <pre>
   * Optional. A list of IDs of Google Cloud regions where messages that are
   * published to the topic may be persisted in storage. Messages published by
   * publishers running in non-allowed Google Cloud regions (or running outside
   * of Google Cloud altogether) are routed for storage in one of the allowed
   * regions. An empty list means that no regions are allowed, and is not a
   * valid configuration.
   * </pre>
   *
   * <code>
   * repeated string allowed_persistence_regions = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The count of allowedPersistenceRegions.
   */
  int getAllowedPersistenceRegionsCount();
  /**
   *
   *
   * <pre>
   * Optional. A list of IDs of Google Cloud regions where messages that are
   * published to the topic may be persisted in storage. Messages published by
   * publishers running in non-allowed Google Cloud regions (or running outside
   * of Google Cloud altogether) are routed for storage in one of the allowed
   * regions. An empty list means that no regions are allowed, and is not a
   * valid configuration.
   * </pre>
   *
   * <code>
   * repeated string allowed_persistence_regions = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The allowedPersistenceRegions at the given index.
   */
  java.lang.String getAllowedPersistenceRegions(int index);
  /**
   *
   *
   * <pre>
   * Optional. A list of IDs of Google Cloud regions where messages that are
   * published to the topic may be persisted in storage. Messages published by
   * publishers running in non-allowed Google Cloud regions (or running outside
   * of Google Cloud altogether) are routed for storage in one of the allowed
   * regions. An empty list means that no regions are allowed, and is not a
   * valid configuration.
   * </pre>
   *
   * <code>
   * repeated string allowed_persistence_regions = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the allowedPersistenceRegions at the given index.
   */
  com.google.protobuf.ByteString getAllowedPersistenceRegionsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. If true, `allowed_persistence_regions` is also used to enforce
   * in-transit guarantees for messages. That is, Pub/Sub will fail
   * Publish operations on this topic and subscribe operations
   * on any subscription attached to this topic in any region that is
   * not in `allowed_persistence_regions`.
   * </pre>
   *
   * <code>bool enforce_in_transit = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enforceInTransit.
   */
  boolean getEnforceInTransit();
}

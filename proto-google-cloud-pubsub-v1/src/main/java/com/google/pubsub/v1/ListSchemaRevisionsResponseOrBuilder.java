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
// source: google/pubsub/v1/schema.proto

// Protobuf Java Version: 3.25.2
package com.google.pubsub.v1;

public interface ListSchemaRevisionsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.ListSchemaRevisionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The revisions of the schema.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.Schema schemas = 1;</code>
   */
  java.util.List<com.google.pubsub.v1.Schema> getSchemasList();
  /**
   *
   *
   * <pre>
   * The revisions of the schema.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.Schema schemas = 1;</code>
   */
  com.google.pubsub.v1.Schema getSchemas(int index);
  /**
   *
   *
   * <pre>
   * The revisions of the schema.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.Schema schemas = 1;</code>
   */
  int getSchemasCount();
  /**
   *
   *
   * <pre>
   * The revisions of the schema.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.Schema schemas = 1;</code>
   */
  java.util.List<? extends com.google.pubsub.v1.SchemaOrBuilder> getSchemasOrBuilderList();
  /**
   *
   *
   * <pre>
   * The revisions of the schema.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.Schema schemas = 1;</code>
   */
  com.google.pubsub.v1.SchemaOrBuilder getSchemasOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is empty, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is empty, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}

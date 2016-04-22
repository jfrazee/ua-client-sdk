/*
 * Copyright 2016 Kevin Herron
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.digitalpetri.opcua.sdk.client.nodes.attached;

import java.util.concurrent.CompletableFuture;

import com.digitalpetri.opcua.sdk.client.OpcUaClient;
import com.digitalpetri.opcua.sdk.client.api.nodes.attached.UaReferenceTypeNode;
import com.digitalpetri.opcua.stack.core.AttributeId;
import com.digitalpetri.opcua.stack.core.types.builtin.DataValue;
import com.digitalpetri.opcua.stack.core.types.builtin.NodeId;
import com.digitalpetri.opcua.stack.core.types.builtin.StatusCode;

public class AttachedReferenceTypeNode extends AttachedNode implements UaReferenceTypeNode {

    public AttachedReferenceTypeNode(OpcUaClient client, NodeId nodeId) {
        super(client, nodeId);
    }

    @Override
    public CompletableFuture<DataValue> readIsAbstract() {
        return readAttribute(AttributeId.IsAbstract);
    }

    @Override
    public CompletableFuture<DataValue> readSymmetric() {
        return readAttribute(AttributeId.Symmetric);
    }

    @Override
    public CompletableFuture<DataValue> readInverseName() {
        return readAttribute(AttributeId.InverseName);
    }

    @Override
    public CompletableFuture<StatusCode> writeIsAbstract(DataValue value) {
        return writeAttribute(AttributeId.IsAbstract, value);
    }

    @Override
    public CompletableFuture<StatusCode> writeSymmetric(DataValue value) {
        return writeAttribute(AttributeId.Symmetric, value);
    }

    @Override
    public CompletableFuture<StatusCode> writeInverseName(DataValue value) {
        return writeAttribute(AttributeId.InverseName, value);
    }

}

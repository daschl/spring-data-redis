/*
 * Copyright 2010-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.data.keyvalue.redis.core;

import java.util.Collection;
import java.util.Set;

/**
 * Set operations bound to a certain key.
 * 
 * @author Costin Leau
 */
public interface BoundSetOperations<K, V> extends KeyBound<K> {

	RedisOperations<K, V> getOperations();

	Set<V> diff(K key);

	Set<V> diff(Collection<K> keys);

	void diffAndStore(K key, K destKey);

	void diffAndStore(Collection<K> keys, K destKey);

	Set<V> intersect(K key);

	Set<V> intersect(Collection<K> keys);

	void intersectAndStore(K key, K destKey);

	void intersectAndStore(Collection<K> keys, K destKey);

	Set<V> union(K key);

	Set<V> union(Collection<K> keys);

	void unionAndStore(K key, K destKey);

	void unionAndStore(Collection<K> keys, K destKey);

	Boolean add(V value);

	Boolean isMember(Object o);

	Set<V> members();

	Boolean move(K destKey, V value);

	V randomMember();

	Boolean remove(Object o);

	V pop();

	Long size();
}

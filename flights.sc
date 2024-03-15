package com.cloudera.flight

import java.io.{BufferedReader, InputStreamReader}
import java.net.{URL, URLConnection}
import java.util._

import com.fasterxml.jackson.databind.{JsonNode, ObjectMapper}
import com.fasterxml.jackson.databind.node.ArrayNode
import org.apache.spark.SparkContext
import org.apache.spark.sql.types._
import org.apache.spark.sql.{Row, RowFactory}

//flight status object
object flightstatus
{
  def getIntOrDefault(node: JsonNode, name: String): java.lang.Integer = {
    var result = 0
    if(node.has(name)) {
      result = node.get(name).asInt
    }
    result
  }

  def getDoubleOrDefault(node: JsonNode, name: String): java.lang.Double = {
    var result = 0.0
    if(node.has(name)) {
      result = node.get(name).asDouble
    }
    result
  }




}
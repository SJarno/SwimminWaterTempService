import { Link } from "./Link"

export interface Property {
    name: string
    links: {
        geoJson: Link,
        json: Link,
        serviceMap: Link,
        site: Link
    }
    tempIn: number
    tempWater: number
}
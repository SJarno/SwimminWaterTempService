import { Coordinates } from "./coordinate"
import { Property } from "./properties"

export interface Feature {
    id: string
    geometry: Coordinates
    properties: Property
}
